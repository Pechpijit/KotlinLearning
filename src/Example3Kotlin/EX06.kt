import java.util.*

object EX06 {
    @JvmStatic fun main(args: Array<String>) {
        print("Enter Text  : ")
        val str = Scanner(System.`in`).nextLine()
        var num = 0
        for (i in 0..str.length -1) {
            if (str[i] == 'F' || str[i] == 'f')
                num += 1
        }
        println("Text : $str , sum 'F' ad 'f' = $num")
    }
}
