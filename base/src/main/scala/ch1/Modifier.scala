package ch1

class Modifier {
    class InnerClass {

        private def privateFunc(): Unit = {
            println("private")
        }

        private[Modifier] def privateStr : String = { // 对 Modifier 来说是可见的但是对于其他的类都是 private 的
            return "private[]"
        }

        protected def protectedFunc(): Unit = {
            println("protected")
        }

        def publicFunc(args: Array[String]): Unit = { // 默认的访问修饰符是 public 的
            println("default public")
        }

    }

    class ExtendsClass extends InnerClass {
        protectedFunc() // 只允许子类访问 protected 成员
    }

//    new InnerClass().func() // 外部类不能访问内部类的 private 成员
    new InnerClass()
    new InnerClass().publicFunc(null) // 可以访问内部类 public 的成员
    val privateStr = new InnerClass().privateStr // 可以访问 InnerClass 中的 private 成员
}
