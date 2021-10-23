import java.text.SimpleDateFormat

fun dayOfProgrammer(year: Int): String {
    val dateFormat = SimpleDateFormat("dd.MM.yyyy")
    var day = 243
    if (year in 1700..1917) { // Julian calendar
        if (year % 4 == 0) {
            day = 244
        }
    } else if (year in 1919..2700) { // Gregorian Calendar
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            day = 244
        }
    } else if (year == 1918) {
        day = 230
    }
    val rest = 256 - day
    val date = "$rest.9.$year"

    return dateFormat.format(dateFormat.parse(date))
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()
    val result = dayOfProgrammer(year)
    println(result)
}