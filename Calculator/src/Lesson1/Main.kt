package Lesson1

import java.util.*

fun main() {
    val cal = Cal()

        var scanner = Scanner(System.`in`)
    while (true) {
        print("1 = ")
        val a = scanner.nextInt()
        scanner = Scanner(System.`in`)
        val sign: String = scanner.next()
        print("2 = ")
        val b = scanner.nextInt()


        when (sign) {
            "+" -> {
                cal.add(a, sign, b)

            }
            "-" -> {
                cal.ayirish(a, sign, b)

            }
            "/" -> {
                cal.bolish(a, sign, b)

            }
            "*" -> {
                cal.kopaytirish(a, sign, b)

            }
            "%" -> {
                cal.foiz(a, b)

            }
        }
    }
}