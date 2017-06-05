object EX14 {
    @JvmStatic fun main(args: Array<String>) {
        val x = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9,10)
        var odd = 0
        var even = 0
        for (i in x.indices) if (i % 2 == 0) odd++ else even++
        println("number odd : $odd number even : $even")
    }
}
