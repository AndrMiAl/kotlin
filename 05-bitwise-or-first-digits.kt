/*Побитовое ИЛИ первых цифр всех чисел*/
fun main()=println(readlnOrNull()
    ?.split(" ")
    ?.filter{it.isNotEmpty()}
    ?.map{it.first().digitToInt()}
    ?.reduce{ a, b->a or b})
