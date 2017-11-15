package ch3

/**
  * Created by zhangrenjie on 2017-11-15
  * iterator 的 map 操作不会执行 map 中的操作，collection 的操作可以
  */
object MapAndForeach {

    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4 ,5)
        var total = 0
        var map: Map[Int, Int] = Map()
        list.foreach(num => {total += num;map += (num -> num)})
        println(total)
        println(map)
        total = 0
        var map2: Map[Int, Int] = Map()
        list.iterator.map(num => {total += num;map2 += (num -> num)})
        println(total)
        println(map2)
    }

}
