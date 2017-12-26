package ch3

object MatchAndCase {

    def main(args: Array[String]): Unit = {
        val tag = true
        print("matchCaseTest : ")
        matchCaseTest(tag)
        print("matchCaseTestWithReturn : " + matchCaseWithReturn(tag))
    }

    def matchCaseTest(tag : Boolean) = {
        tag match {
            case true => {
                println("true")
            }
            case _ => {
                println("false")
            }
        }
    }

    def matchCaseWithReturn(tag : Boolean) = {
        tag match {
            case true => {
                "true"
            }
            case _ => {
                "false"
            }
        }
    }

}
