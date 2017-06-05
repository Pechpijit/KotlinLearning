import java.util.*

object EX04 {
    @JvmStatic fun main(args: Array<String>) {
        print("Enter number : ")
        val number = Scanner(System.`in`).nextLine()
        println("Year = ${number.substring(0, 2)} ,No. ${number.substring(9)}")
    }
}
