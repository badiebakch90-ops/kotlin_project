
// ex 1:
//open class Forme(val couleur : String) {
//    open fun afficherInfo(){
//        println("couleur : $couleur")
//    }
//}
//class Cercle(couleur : String , val r : Double) : Forme(couleur ){
//    override fun afficherInfo(){
//        println("couleur : $couleur , r : $r")
//    }
//}
//class Rectangle(couleur : String,val h : Double ,val l : Double ) : Forme(couleur){
//    override fun afficherInfo(){
//        println("couleur : $couleur , hauteur : $h, largeur : $l")
//    }
//}



////ex3 :
//open class Vehicule(val marque : String){
//    init {
//       println("Vehicule created!")
//    }
//}
//class Voiture(marque : String , val nombrePortes : Int) : Vehicule(marque){
//    init {
//        println("$marque created with $nombrePortes doors")
//    }
//}
//class Camion(marque: String,val capaciteCharge : Double) : Vehicule(marque){
//    init {
//        println("$marque created with capacity charging $capaciteCharge Kg")
//    }
//}

// ex4 :


//open class Appareil(val marque : String , var allume: Boolean = false){
//    init {
//        println("Marque $marque")
//    }
//    open fun allumer() {
//        allume = true
//    }
//}
//class Telephone(marque: String , val numeroTelephone : Int) : Appareil(marque){
//    init {
//        println("Telephone a ete criee avec un numero $numeroTelephone")
//    }
//}
//class Ordinateur(marque : String , val systemExploitation : String ) : Appareil(marque){
//    init {
//        println("$marque a ete gere par systeme d'exploitation  $systemExploitation")
//    }
//}





fun main(){
// val cercle =Cercle("red" , 4.0)
//    cercle.afficherInfo()
//    val rectangle =Rectangle(couleur = "red", h = 4.0, l = 5.0)
//    rectangle.afficherInfo()



//    val voiture = Voiture(marque ="Voiture" , 4)
//    val camion = Camion(marque = "Camion" , 4000.0)

//    val telephone = Telephone("Iphone 17" , 121562)
//    telephone.allumer()
//
//    val ordinateur = Ordinateur("Mac air " , "MacOs")
//    ordinateur.allumer()

}