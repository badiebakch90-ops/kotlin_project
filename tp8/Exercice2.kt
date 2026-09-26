enum class TypeVehicule{
    VOITURE,
    MOTO ,
    BATEAU
}
sealed class Vehicule(
    val nom :String ,
    val marque: String ,
    val type : TypeVehicule
)
data class Voiture(val n: String ,val m:String) : Vehicule(n ,m, TypeVehicule.VOITURE),Volant{
    override fun voler(): String {
       return "$n de marque $m capabale de voler"
    }
}
data class Moto(val n: String ,val m:String) : Vehicule(n ,m, TypeVehicule.MOTO),Volant{
    override fun voler(): String {
        return "$n de marque $m capabale de voler"}
    }
data class Bateau(val n: String ,val m:String) : Vehicule(n ,m, TypeVehicule.BATEAU),
        Navigable{
    override fun naviguer(): String {
        return "$n de marque $m , capable de naviguer"
    }
}

interface Navigable{
    fun naviguer():String
}
interface Volant{
    fun voler():String
}

fun main() {
    val list = mutableListOf<Vehicule>()

    fun ajouterVehicule(vehicule: (Vehicule)) {
        list.add(vehicule)
        println("${vehicule.marque} ajouter avec succes")
    }

    fun afficherInformation() {
        for (v in list) {
        println("type: ${v.type}")
        println("nom : ${v.nom}")
        println("marque: ${v.marque}")

        if (v is Navigable) {
            println(v.naviguer())
        }
        if (v is Volant) {
            println(v.voler())
        }

    }}
    ajouterVehicule(Voiture("G63" ,"Mercedise"))
    ajouterVehicule(Moto("h2R" ,"cawazaki"))
    ajouterVehicule(Bateau("bateau" ,"bateau"))
    afficherInformation()

}
