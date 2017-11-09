package ch3

object Collections {

    def main(args: Array[String]): Unit = {
        listTest()
        println()
        mapTest()
    }

    def listTest() = {
        val list1 = List(1, 2, 3, 4, 5)
        val list2 = List(6, 7, 8, 9, 10)
        val list3 = List(11)
        val list4 = List(list1, list2, list3)

        println("filter : " + list1.filter(_ % 2 == 0)) // 过滤出偶数
        println("map : " + list1.map(i => i * 2)) // 将所有元素执行 map 中的表达式
        println("flatten : " + List(list2, list1, list3).flatten) // 将多个集合整合为一个集合
        println("flatMap : " + list4.flatMap(i => i.map(_ * 2))) // flatMap 相当于 flatten 和 map 的结合
    }

    def mapTest() = {
        val map = Map("key" -> "value", "key1" -> "value1")
        // 用 filter 过滤整个 map 时指定一个形参 p，用 p._1 p._2 来获取 key 和 value
        println("map.filter : " + map.filter(p => p._1.equals("key")))
        println("map.filterKeys : " + map.filterKeys(a => a.equals("key"))) // 用 filterKeys 过滤符合条件的 key

        var map1 = Map("key" -> "value1")
        map1 += ("key2" -> "value2") // 可以直接用 += 号添加映射
        println("map ++ : " + (map ++ map1)) // map 的 ++ 运算符可以将两个 map 结合
        println("map.keys : " + map.keySet) // 用 map.keySet 获取 key 的集合，也可以用 map.keys 获取迭代器
        println("map.values : " + map.values) // 用 map.values 获取迭代器
        println("map.mapValues : " + map.mapValues(value => value + ",")) // 用 map.mapValues 可以将所有的 value 执行表达式
        println(map.foreach(m => println(m._1 + " " + m._2 + " "))) // map.foreach

        map.get("key1") match { // map.get 返回一个 Options，表示可能有东西返回也可能没有，如果有东西返回就是 Some，没有就是 None
            case Some(value) => println(value)
            case _ => println("none")
        }
    }

}
