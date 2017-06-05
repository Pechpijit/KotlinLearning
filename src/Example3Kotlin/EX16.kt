object EX16 {
    @JvmStatic fun main(args: Array<String>) {
        val x = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        var y = IntArray(x.size * 2)
        for (i in x.indices) y[i] = x[i]
        println(y.contentToString())
    }
}
