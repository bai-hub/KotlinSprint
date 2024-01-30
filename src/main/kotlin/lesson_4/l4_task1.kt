fun main() {
    val reservedPlaceForToday = false
    val notReservedPlaceForTomorrow = true
    println("Доступность столиков на сегодня: $reservedPlaceForToday")
    println("Доступность столиков на завтра: $notReservedPlaceForTomorrow")


    val reservForToday = 13
    val reservForTomorrow = 5
    val comparePlace = reservForTomorrow >= reservForToday
    val comparePlaceTomorrow = reservForToday >= reservForTomorrow

    println("Доступность столиков на сегодня: $comparePlace")
    println("Доступность столиков на Завтра: $comparePlaceTomorrow")
}