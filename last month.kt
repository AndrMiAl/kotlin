fun isLeap(y: Int) = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)

fun daysInMonth(m: Int, y: Int) = when (m) {
    1, 3, 5, 7, 8, 10, 12 -> 31
    4, 6, 9, 11 -> 30
    2 -> if (isLeap(y)) 29 else 28
    else -> -1
}

fun main() {
    println("Введите год:")
    val yIn = readlnOrNull()?.trim()?.toIntOrNull()
    println("Введите месяц:")
    val mIn = readlnOrNull()?.trim()?.toIntOrNull()
    println("Введите день:")
    val dIn = readlnOrNull()?.trim()?.toIntOrNull()

    val dim = daysInMonth(mIn ?: 0, yIn ?: 0)

    if (yIn == null || mIn == null || dIn == null || yIn < 1 || dim == -1 || dIn !in 1..dim) {
        println("месяц введен не так")

    } else {

        val (nm, ny) =
            if (mIn in 1..10) {
                (mIn + 2) to yIn
            } else {
                (mIn - 10) to (yIn + 1)
            }

        val maxNew = daysInMonth(nm, ny)
        val nd = if (dIn <= maxNew) dIn else maxNew

        println("Дата через 2 месяца: $nd.$nm.$ny")
        println("Это последний день месяца: " + if (nd == maxNew) "да" else "нет")
    }
}