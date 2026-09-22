abstract  class Vehicule(val marque : String , val model : String ){
    open fun afficher_details(){
        println("marque $marque \n model $model")
    }
    abstract fun se_deplacer() : String
}
class Avion( marque : String,  model : String , val ailes : String , val nbrRoues : Int )  : Vehicule( marque , model ){
    override fun se_deplacer() = "avion ce deplace en air"
    override fun afficher_details(){
        println("marque $marque \n model $model")
        println("ailes $ailes \n nbrRoues $nbrRoues,")
    }
}
class Voiture(marque: String, model : String , val annee : Int , val nbrRoues: Int) : Vehicule(marque , model ){
    override fun se_deplacer() = "voiture ce deplace par terre"
}
class Velo(marque: String, model : String , val nbrRoues: Int) : Vehicule(marque , model ){
    override fun se_deplacer() = "velo ce deplace par terre"
}

fun main(){
//    val avion =Avion("" , "" , "", 3)
//    println(avion.se_deplacer())
//    val voiture =Voiture("" , "" , 30, 4)
//    println(voiture.se_deplacer())
//    val velo =Velo("" , "" , 2)
//    println(velo.se_deplacer())

    val listAvion = listOf<Avion>(
        Avion("1" , "1" ,  "1", 3),
        Avion("2" , "2" ,  "2", 3)
    )
    listAvion.forEach {
        it.afficher_details()
        it.se_deplacer()}

    val listVoiture = listOf<Voiture>(
        Voiture("1", "1" , 1 , 4),
        Voiture("2", "2" , 2 , 4)
    )
    val listVelo = listOf<Velo>(
        Velo("1" , "1", 2),
        Velo("2" , "2", 2)
    )

}