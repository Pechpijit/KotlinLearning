import java.util.*

object EX19 {
    @JvmStatic fun main(args: Array<String>) {
        print("Enter x : ")
        val x = Scanner(System.`in`).nextInt()
        print("Enter y : ")
        val y = Scanner(System.`in`).nextInt()
        val num = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val snum = IntArray(y - x + 1)
        var index = 0
        for (i in x..y + 1 - 1) {
            snum[index] = num[i]
            index++
        }
        println("Array num : ${num.contentToString()}")
        println(snum.contentToString())
    }
}
