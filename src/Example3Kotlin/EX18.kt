import java.util.*

object EX18 {
    @JvmStatic fun main(args: Array<String>) {
        print("Enter number : ")
        val x = Scanner(System.`in`).nextInt()
        val num = listOf(1, 2, 3, 4, 5, 6, 33, 6, 8, 33)
        var sum = 0
        for (i in num.indices) if (num[i] == x) sum++
        println("sum Array x == num : $sum")
    }
}
