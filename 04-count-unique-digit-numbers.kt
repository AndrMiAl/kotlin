/*Количество чисел без повторяющихся цифр*/
fun main()=println(readlnOrNull()
    ?.split(" ")
    ?.filter{it.isNotEmpty()}
    ?.count{it.toSet().size==it.length})
