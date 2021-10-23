/*
 * Complete the 'saveThePrisoner' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER m
 *  3. INTEGER s
 */

fun saveThePrisoner(prisoners: Int, sweets: Int, initChair: Int): Int {
    // prisoners = 4
    // sweets = 6
    // initChair = 2
    // 2, 3, 4, 1, 2, 3

    // 6 % 4 = 2

    val missing = sweets % prisoners
    val position = missing + initChair - 1
    return if (position % prisoners == 0) {
        prisoners
    } else {
        position % prisoners
    }
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")
        val n = first_multiple_input[0].toInt()
        val m = first_multiple_input[1].toInt()
        val s = first_multiple_input[2].toInt()
        val result = saveThePrisoner(n, m, s)
        println(result)
    }
}
