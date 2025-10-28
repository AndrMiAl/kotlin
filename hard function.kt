fun maxNullable(f: (Int) -> Int?, g: (Int) -> Int?): (Int) -> Int? = { x ->
    val a = f(x)
    val b = g(x)
    if (a == null || b == null) null else maxOf(a, b)
}

fun main() {
    val f: (Int) -> Int? = { x -> if (x >= 0) x * 2 else null }
    val g: (Int) -> Int? = { x -> if (x % 2 == 0) x + 10 else null }

    val maxFand = maxNullable(f, g)

    println(maxFand(4))
    println(maxFand(3))
    println(maxFand(-1))
}
