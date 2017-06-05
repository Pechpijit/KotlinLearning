import java.util.*

object EX07 {
    @JvmStatic fun main(args: Array<String>) {
        print("Enter Text : ")
        val str = Scanner(System.`in`).nextLine()
        var show = ""
        for (i in 1..str.length) show += str[str.length - i]
        println("Text Reverse : $show")
    }
}
