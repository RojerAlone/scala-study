package ch2

object Test {
    def main(args: Array[String]) {
        println( "muliplier(1) value = " +  multiplier(1) )
        println( "muliplier(2) value = " +  multiplier(2) )
        println(factor)
    }
    var factor = 3
    val multiplier = (i:Int) => i * factor
}