/*Максимальная цифра, кратная 3*/
fun main()=println(readlnOrNull()
    ?.takeIf { s -> s.all{ it.isDigit() } }
    ?.map{it.digitToInt()}
    ?.filter{it%3==0}
    ?.maxOrNull()
    ?:"Ввод не верен или нет чисел кратных 3")

