import java.util.*

object EX05 {
    @JvmStatic fun main(args: Array<String>) {
        print("Enter Text : ")
        val str = Scanner(System.`in`).nextLine()
        val str1 = str.trim().split(" ")
        println("Text1 : ${str1[0]}, Text2 : ${str1[str1.size - 1]}")
    }
}
