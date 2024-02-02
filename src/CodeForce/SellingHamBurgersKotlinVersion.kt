package CodeForce

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val testCase = sc.nextLine().toInt()

    for (i in 0 until testCase) {
        val numOfCustomer = sc.nextLine().toInt()
        val numOfCoins = sc.nextLine().split(" ").toTypedArray()
        coinsCanBeEarned(numOfCoins)
    }
}

fun coinsCanBeEarned(numOfCoins: Array<String>) {
    val possibleEarning = mutableListOf<Long>()
    numOfCoins.sortWith { s1, s2 ->
        s1.toLong().compareTo(s2.toLong())
    }
    for (i in numOfCoins.indices) {
        possibleEarning.add(numOfCoins[i].toLong() * (numOfCoins.size - i))
    }
    println(Collections.max(possibleEarning))
}
