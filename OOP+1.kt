interface Pif {
    val mgmtCompany: String     // Управляющая компания
    val fundName: String        // Название фонда
    val founded: Int            // Год основания

    fun kind(): String = "Обычный ПИФ"
    fun info(): String = "УК: $mgmtCompany | Фонд: \"$fundName\" | Основан: $founded | Тип: ${kind()}"
}

// ===== Базовая реализация ====================================================
data class BasePif(
    override val mgmtCompany: String,
    override val fundName: String,
    override val founded: Int
) : Pif

// ===== Декоратор: Интервальный ПИФ (без LocalDate, даты строками) ===========
class IntervalPif(
    private val base: Pif,
    private val nextWindowStart: String,
    private val nextWindowEnd: String
) : Pif by base {
    override fun kind(): String = base.kind() + " + Интервальный"
    override fun info(): String =
        base.info() + " | Следующий интервал: $nextWindowStart–$nextWindowEnd"
}

// ===== Декоратор: ПИФ акций ==================================================
enum class EquityTier(val ru: String) { FIRST("первый"), SECOND("второй"), }

class EquityPif(
    private val base: Pif,
    private val tier: EquityTier
) : Pif by base {
    override fun kind(): String = base.kind() + " + Акций (${tier.ru} эшелон)"
    override fun info(): String = base.info() + " | Эшелон акций: ${tier.ru}"
}

// ===== Утилиты ===============================================================
fun List<Pif>.foundedBefore(year: Int): List<Pif> = filter { it.founded < year }

// ===== Демо-данные ===========================================================
fun demoDataset(): List<Pif> {
    val a = BasePif("Альфа-Капитал", "Сбалансированный рост", 2005)
    val b = BasePif("Тинькофф Капитал", "Технологии будущего", 2012)
    val c = BasePif("Сбер Управление Активами", "Дивиденды РФ", 2007)
    val d = BasePif("ВТБ Капитал", "Европа Blue Chips", 2001)

    // Комбинации декораторов
    val cEquity = EquityPif(c, EquityTier.FIRST)
    val aInterval = IntervalPif(a, "01.11.2025", "15.11.2025")
    val dIntervalEquity = EquityPif(
        IntervalPif(d, "05.12.2025", "20.12.2025"),
        EquityTier.SECOND
    )

    return listOf(a, b, cEquity, dIntervalEquity, aInterval)
}

// ===== Точка входа ===========================================================
fun main() {
    val pifs = demoDataset()

    val filtered = pifs.foundedBefore(2008)
    if (filtered.isEmpty()) {
        println("Фондов, основанных до 2008 года, не найдено.")
    } else {
        println("ПИФы, основанные до 2008 года:")
        filtered.forEach { println(" - " + it.info()) }
    }

    println("\nТипы (чтобы увидеть, как работают декораторы):")
    pifs.forEach { println(" * ${it.fundName} → ${it.kind()}") }
}
