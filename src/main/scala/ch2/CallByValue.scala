package ch2

/**
  * 传值调用，先计算参数表达式的值，再应用到函数内部
  */
object CallByValue {

    def main(args: Array[String]): Unit = {
        delayed(() => time())
    }

    def time() = {
        println("get current time : " + System.currentTimeMillis())
        System.currentTimeMillis()
    }

    def delayed(time : () => Long) = { // () => 表示传值调用，函数的计算过程是在执行调用函数之前
        println("method delayed")
        println("arg : " + time) // 第一次调用传进来的参数，直接获取了值
        time // 第二次调用传进来的参数
    }

}
