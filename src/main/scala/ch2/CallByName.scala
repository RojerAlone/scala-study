package ch2

/**
  * 传名调用，传入函数名字，每次调用的时候都在函数内部计算传入函数的值
  */
object CallByName {

    def main(args: Array[String]): Unit = {
        delayed(time(1))
    }

    def time(num : Int) = {
        println("get current time : " + System.currentTimeMillis())
        System.currentTimeMillis()
    }

    def delayed(time: => Long) = { // => 表示传名调用，函数的计算过程是在调用函数的内部
        println("method delayed")
        println("arg : " + time) // 第一次调用传进来的参数，其实这里进行了函数的计算
        time // 第二次调用传进来的参数，也进行了函数的计算
    }

}
