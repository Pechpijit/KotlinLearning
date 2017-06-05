import java.util.*

object EX12 {
    @JvmStatic fun main(args: Array<String>) {
        print("Enter Text : ")
        val n = Scanner(System.`in`).nextLine()
        var x = arrayOfNulls<String>(10)
        for (i in x.indices) x[i] = n
        println("Array x : ${Arrays.toString(x)}")
    }
}
