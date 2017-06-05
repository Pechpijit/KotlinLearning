import java.util.*

object EX08 {
    @JvmStatic fun main(args: Array<String>) {
        print("Enter Text : ")
        val str = Scanner(System.`in`).nextLine()
        print("String : ${str.replace(" ","")}")
    }
}
