fun main() {
    println("Введите число")
    var lis = readlnOrNull()?.toIntOrNull()
    if (lis != null && lis >= 0) {
        var minDigit = -1


        while (lis > 0) {
            val digit = lis % 10
            lis /= 10

            if (digit % 2 == 1 && digit > minDigit) {
                minDigit = digit
            }

        }
        if (minDigit != -1){
            println(minDigit)
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