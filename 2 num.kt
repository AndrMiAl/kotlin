fun main() {
    println("Введите число")
    val lis = readlnOrNull()?.toIntOrNull()
    if (lis != null && lis >= 0) {
        val maxDigit = maxNumber(lis) {x: Int -> x % 3 == 0}

        if (maxDigit != -1){
            println(maxDigit)
        }
        else
        {
            println("нет нечётных чисел")
        }
    }
    else {
        println("Число введено не верно, попробуйте снова")
    }
}

fun maxNumber(lis: Int, condition: (Int) -> Boolean): Int {
    var chang = lis
    var maxDigit = -1
    while (chang > 0) {
        val digit = chang % 10
        chang /= 10

        if (condition(digit) && digit > maxDigit) {
            maxDigit = digit
        }

    }
    return maxDigit
}


