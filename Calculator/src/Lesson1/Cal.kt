package Lesson1

class Cal : Calculator {
    var res: Int = 0
    override fun add(a: Int, sign: String, b: Int) {
        res = a + b
        println("$a + $b = $res")

    }

    override fun ayirish(a: Int, sign: String, b: Int) {
        res = a - b
        println("$a - $b = $res")
    }

    override fun bolish(a: Int, sign: String, b: Int) {
        res = a / b
        println("$a / $b = $res")
    }

    override fun kopaytirish(a: Int, sign: String, b: Int) {
        res = a * b
        println("$a * $b = $res")
    }

    override fun foiz(a: Int, b: Int) {
        res = (a / 100)*b
        println("$a % $b = $res  %")
        println("====================")
        res+=a
        println("$a % $b = $res  %")


    }
}