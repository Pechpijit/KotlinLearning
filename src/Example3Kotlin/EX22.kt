import java.util.*

object EX22 {
    @JvmStatic fun main(args: Array<String>) {
        print("Enter row : ")
        val row = Scanner(System.`in`).nextInt()
        print("Enter colum : ")
        val comlum = Scanner(System.`in`).nextInt()
        val x = Array(row) { IntArray(comlum) }

        for (i in 0 until  row) {
            for (j in 0 until comlum) {
                print("Enter Array : ")
                x[i][j] = Scanner(System.`in`).nextInt()
            }
        }
        println(x.contentDeepToString())
    }
}
