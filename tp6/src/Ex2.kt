sealed class Opertion(var a: Double , var b: Double)
class Addition( val x: Double ,  val y: Double) : Opertion( x ,  y)
class Soustrection(val x: Double, val y: Double) : Opertion( x ,  y)
class Multiplication(val x: Double, val y: Double) :Opertion( x ,  y)
class Division(val x: Double, val y: Double) : Opertion( x ,  y)

fun calculer(opertion: Opertion) =
      when (opertion) {
        is Addition ->  opertion.x + opertion.y
        is Division -> opertion.x  / opertion.y
        is Multiplication ->opertion.x * opertion.y
        is Soustrection -> opertion.x - opertion.y
    }

fun main() {
    println(calculer(Addition(2.0, 3.0)))
    println(calculer(Division(2.0, 3.0)))



}