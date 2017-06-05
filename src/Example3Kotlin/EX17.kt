object EX17 {
    @JvmStatic fun main(args: Array<String>) {
        var y = arrayOfNulls<String>(10)
        val x = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
        val n = "SSRU"
        for (i in y.indices) y[i] = x[i] + n
        println("Array y : ${y.contentToString()}")
    }
}
