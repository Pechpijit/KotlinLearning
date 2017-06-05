import java.util.*

object EX11 {
    @JvmStatic fun main(args: Array<String>) {
        var a = DoubleArray(10)
        for (i in a.indices) {
            print("Enter number ${i + 1} : ")
            a[i] = Scanner(System.`in`).nextDouble()
        }
    }
}
