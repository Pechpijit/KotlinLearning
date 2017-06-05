import java.util.*

object EX03 {
    @JvmStatic fun main(args: Array<String>) {
        print("Enter number: ")
        val number = Scanner(System.`in`).nextLine()
        val str = number.substring(0, number.indexOf("."))
        val str2 = number.substring(number.indexOf("."), number.indexOf(".") + 3)
        println("number : $str$str2")
    }
}
