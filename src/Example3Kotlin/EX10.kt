object EX10 {
    @JvmStatic fun main(args: Array<String>) {
        var n = IntArray(10)
        var index = 0
        for (i in 0 until 20) {
            if (i % 2 == 1) {
                n[index] = i
                index++
            }
        }
        for (i in n.indices) println("Array n[$i] = ${n[i]}")
    }
}
