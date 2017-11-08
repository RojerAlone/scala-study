package ch3

object ForWhile {

    def main(args: Array[String]): Unit = {
        forTest()
        whileTest(10)
    }

    def forTest() = {
        /**
          * to 包括上限值
          * 打印结果为 0 1 2 3 4 5 6 7 8 9 10
          */
        for (i <- 0 to 10) {
            print(i + " ")
        }
        println()
        /**
          * until 不包括上限值
          * 打印结果为 0 1 2 3 4 5 6 7 8 9
          */
        for (i <- 0 until 10) {
            print(i + " ")
        }
        println()
        for (a <- -5 until 0; b <- 0 until 5; c <- 1 to 2) { // ; 分隔开多个表达式，每次循环只会执行一个表达式
            println("a : " + a + " b : " + b)
        }
        println()
        val list = List(1, 2, 3, 4, 5)
        for (a <- list) { // for 遍历 list 集合
            print(a + " ")
        }
        println()
        for (i <- 1 to 10; if i % 2 == 0) { // for 中可以添加多个表达式来过滤符合条件的元素
            print(i + " ")
        }
        println()
        // for 和 yield 结合，将符合 for 中表达式的元素根据 yield 后面的表达式计算后存起来
        val ii = for {i <- 1 to 5} yield i * 3
        println("for yield " + ii)
    }

    def whileTest(tag : => Int) = {
        var tag1 = 0
        while (tag1 < 10) {
            tag1 += 1
            println(tag1)
        }
    }

}
