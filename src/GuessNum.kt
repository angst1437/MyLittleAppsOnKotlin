package guessNum

import kotlin.random.Random


fun readNum(): Byte {
    var userValue: Byte?
    while (true) {
        print("Введите число от 1 до 100:  ")
        userValue = readlnOrNull()?.toByteOrNull()

        if (userValue == null || userValue !in 1..100) {
            println("Введено не число либо число не из диапазона 1..100")
            continue
        }
        else return userValue
    }

}

fun main(args: Array<String>) {
    val randomValue: Byte = Random.nextInt(1, 100).toByte()


    while (true) {
        val userValue: Byte = readNum()
        when {
            userValue > randomValue -> {println("Ваше число больше загаданного! Попробуйте еще раз"); continue}
            userValue < randomValue -> {println("Ваше число меньше загаданного! Попробуйте еще раз"); continue}
            else -> {println("Верно! Вы победили!"); break}
        }
    }

}