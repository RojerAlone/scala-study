package ch1

object BasicDataType {

    def main(args: Array[String]): Unit = {
        var a = "a" // var 定义的是一个变量
        a = "b"
        val b = "b"
        a = b
//        b = "a" // val 定义的是一个常量
        var c = 123
//        c = "123" // Scala 并不是一个完全弱类型的语言
        var char : Char = 'c'
        println(a + " " + b + " " + c + " " + char)
    }
}
