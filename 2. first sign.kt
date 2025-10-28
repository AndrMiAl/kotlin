/*Первый символ самого короткого слова чётной длины*/
fun main()=println(readlnOrNull()
    ?.split(" ")
    ?.filter{it.isNotEmpty()&&it.length%2==0}
    ?.minByOrNull{it.length}?.firstOrNull()
    ?:"Ввод не верен или нет слов чётной длины")


