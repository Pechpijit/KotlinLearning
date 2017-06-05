package Example3Kotlin

import java.util.Scanner

object EX02 {
    @JvmStatic fun main(args: Array<String>) {
        print("Enter number : ")
        val number = Scanner(System.`in`).nextLine()
        println("Phone number : ${number.substring(0, 3)}-${number.substring(4)}")
    }
}
