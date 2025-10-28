import kotlin.math.sqrt

fun main()=println(readlnOrNull()
    ?.toIntOrNull()?.let{n->(1..n*2).flatMap{a->(a..n*2)
        .map{b->Triple(a,b,sqrt((a*a+b*b).toDouble()).toInt())}}
        .filter{ t->t.first*t.first+t.second*t.second==t.third*t.third&&t.first+t.second+t.third>n}
        .minByOrNull { (a,b,c) -> a + b + c }} ?: "-1")

