open class Appareil(var marque : String ,  var allume : Boolean = false ){
    init {
        println("la marque $marque")
    }
    open fun allumer() {
        allume = true
    }
}
class Telephone(marque: String , var numTelephone: Number):Appareil(marque){
    init {
        println("la telephone $marque a ete criee numero : $numTelephone")
    }

}
class Ordinateur(marque : String , systhemExploitation : String) :Appareil(marque){
    init {
        println("la ordineur $marque a ete criee avec systhem exploitation : $systhemExploitation ")
    }
}
fun main() {
    val telephone = Telephone("Sumsung" , 45215398239776)
    telephone.allumer()

    val ordinateur = Ordinateur("Hp" , "Windows")
    ordinateur.allumer()
}