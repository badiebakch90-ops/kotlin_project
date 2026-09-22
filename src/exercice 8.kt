enum class DayOfWeek(val j: Int){
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7)
}
fun chekDay( day : DayOfWeek) :String {
     return when(day)  {
         DayOfWeek.MONDAY  -> "lundi : debut de semain"
         DayOfWeek.TUESDAY , DayOfWeek.WEDNESDAY , DayOfWeek.THURSDAY-> "L'interieur de la semain"


         DayOfWeek.FRIDAY -> "Vendredi : presque le week-end"
         DayOfWeek.SATURDAY , DayOfWeek.SUNDAY-> "Le jour de week-end"
     }
}
fun main() {
    val jour = DayOfWeek.MONDAY.j
    println(jour)
    println(chekDay(DayOfWeek.MONDAY))
    println(chekDay(DayOfWeek.TUESDAY))

    println(chekDay(DayOfWeek.FRIDAY))
    println(chekDay(DayOfWeek.SUNDAY))
}