object EX21 {
    @JvmStatic fun main(args: Array<String>) {
        val a = arrayOf("a", "b", "c", "d", "e")
        val b = arrayOf("a", "b", "c", "d", "e")
        println("Array a == Array b : ${a.size == b.size}")
        if (a.size == b.size)
            for (i in a.indices)
                println("a[$i] == b[$i] : ${a[i] == b[i]}")
    }
}
