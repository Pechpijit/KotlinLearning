import java.util.*

object EX09 {
    @JvmStatic fun main(args: Array<String>) {
        print("Enter Text : ")
        val str = Scanner(System.`in`).nextLine()
        var revers = ""
        for (i in str.length - 1 downTo 0) revers += str[i]
        println(if (str == revers) "It is palindrom" else "It is not palindrom")
    }
}
