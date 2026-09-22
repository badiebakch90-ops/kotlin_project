//interface Vehicule{
//    val marque: String
//    fun afficher (): String
//}
//open class VehiculeBase(override val marque: String) : Vehicule{
//    override fun afficher(): String {
//      return marque
//    }
//
//}
//class Voiture(marque: String ,val nombrePortes: Int  ): VehiculeBase(marque){
//    fun klaxonner(){
//   println("Vehicule klaxonner avec $nombrePortes portes.")
//    }
//    override fun afficher(): String {
//        return "Vehicule $marque elle a $nombrePortes port "
//
//    }
//}
//class Camion(marque: String , val capaciteChargement:Int) : VehiculeBase(marque){
//    fun charger() {
//        println("capaciter de charge : ${capaciteChargement}" )
//    }
//}
//fun main(){
//    val voiture = Voiture("bmw" , 4)
//    voiture.klaxonner()
//    println(voiture.afficher())
//}