////interface Vehicle{
////  fun start() : String
////  fun stop() : String
////}
////class Car( val nome : String ) : Vehicle{
////  override fun start() : String{
////
////    return "Car : $nome start"
////  }
////  override fun stop() : String{
////    return "Car : $nome stop"
////  }
////}
////ex3 :
//
//interface Animal{
//    val nom : String
//    fun parler() : String
//    fun  seDeplacer() : String
//}
//interface Volant{
//    fun voler(): String
//
//}
//class Oiseau(override  val nom : String): Animal , Volant {
//
//    override fun parler() = "$nom  chante"
//    override fun seDeplacer() = "se deplace A l'air"
//    override fun voler() = ""
//    }
//class Chien(override  val nom : String) : Animal {
//
//    override fun parler() = "$nom aboie "
//    override fun seDeplacer() = "se deplace terre"
//
//}
//class Poisson(override  val nom : String) : Animal {
//
//    override fun parler() = "$nom ne fait pas de bruit ."
//    override fun seDeplacer() = "se deplace dans mere"
//}
//
//
//
//fun main() {
////  val car = Car("BMW")
////  println(car.start())
//    val oiseau = Oiseau("oiseau")
//    println(oiseau.nom)
//    println(oiseau.parler())
//    println(oiseau.seDeplacer())
//    val chien = Chien("chien")
//    println(chien.nom)
//    println(chien.parler())
//    println(chien.seDeplacer())
//    val poisson = Poisson("poisson")
//    println(poisson.nom)
//    println(poisson.parler())
//    println(poisson.seDeplacer())
//
//
//
//}