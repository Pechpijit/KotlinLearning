object EX15 {
    @JvmStatic fun main(args: Array<String>) {
        var y = BooleanArray(10)
        val x = listOf(10, 55, 9, 8, 6, 56, 24, 8, 66, 10)
        for (i in y.indices) y[i] = x[i] > 10
        println("Array y : ${y.contentToString()}")
    }
}
