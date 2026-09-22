//import jdk.jfr.internal.consumer.EventLog.update
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//// ex1 :
//class MaClasse {
//    var x = 23
//    var y = x + 6
//}
//fun afficher() {
//    val obj = MaClasse()
//    println("x = ${obj.x} , y = ${obj.y}")
//}
//
//// ex2 :
//class Personne (
//    var nom: String ,
//    var prenom: String,
//    var adresse: String ,
//    var age: Int
//){
//fun UpdateNom(newName: String) {
//   nom = newName
//}
//fun UpdatePrenom(newPrenom: String) {
//  prenom = newPrenom
//}
//fun UpdateAdresse(newAdresse: String) {
//   adresse = newAdresse
//}
//fun UpdateAge(newAge: Int) {
//  age = newAge
//}
//fun afficherPersonne(){
//    println("Personne(nom=$nom, prenom=$prenom, adresse=$adresse, age=$age)")
//}
//}
//
//// ex 3 :
//
//class Car{
//    var marque: String =""
//    var model: String =""
//    var color: String =""
//    var kilometrage : Int =0
//}
//fun UpdateMarque(newMarque: String) {
//    Car().marque = newMarque
//    println(Car().marque)
//}
//fun UpdateModel(newModel: String) {
//
//        Car() .model = newModel
//    println(Car().model)
//}
//fun UpdateColor(newColor: String) {
//
//    Car(). color= newColor
//    println(Car().color )
//}
//
//
//
//// fun UpdateKilometer(newKilometer: Double) {
////    Car().kilometrage = newKilometer
////    println(update4.kilometrage)
////}
////fun AfficherCar(){
////    UpdateMarque("marque")
////    UpdateModel("model")
////    UpdateColor("color")
////    UpdateKilometer(200000.0)
////}
//
////ex 4 :
//abstract class Forme( var nom: String ){
//    abstract fun surface(): Double
//    abstract fun perimetre(): Double
//    fun afficher_Details(){
//        println("Forme : $nom , surface : ${surface()} , perimetre : ${perimetre()}")
//    }
//}
//class carre( val a:Double): Forme("Carre"){
//    override fun surface() = a * a
//    override fun perimetre() = 4 * a
//    }
//class Rectangle( val x:Double , val y:Double): Forme("Rectangle"){
//    override fun surface() = x * y
//    override fun perimetre() = 2 * (x + y)
//}
//class Cercle( val r : Double):Forme("Cercle"){
//    override fun surface() = 3.14 * r * r
//    override fun perimetre() = 3.14 * 2 * r
//}
//
//
//// Ex 5:
//abstract  class Vehicule(val marque : String, val model : Int){
//    open fun afficher_details(){
//        println("marque: $marque, model: $model")
//    }
//    abstract fun se_deplace() : String
//}
//class Avion( val ailes : String,val nbrRoues : Int , marque: String , model : Int): Vehicule("Avion" , 2000){
//    override fun afficher_details(){
//        println("ailes : $ailes , nbrRoues : $nbrRoues , marque : marque = $marque , model = $model")
//    }
//    override fun se_deplace() = "$marque ce deplace en volant"
//}
//
//class voiture(val annnee : Int , val nbrRoues : Int): Vehicule("Voiture" , 2020){
//    override fun afficher_details(){
//        println("Annee : $annnee , nbrRoues : $nbrRoues ,marque = $marque, model = $model")
//    }
//    override fun se_deplace() = "$marque ce deplace en roulant"
//}
//class velo(val nbrRoues: Int): Vehicule("Velo" , 2024){
//    override fun afficher_details(){
//        println("nbrRoues : $nbrRoues ,marque :$marque , model: $model")
//    }
//    override fun se_deplace() = "$marque ce deplace en roulant"
//
//}
//
//
//
//
//
//
//fun main() {
////    afficher()
////    val personne = Personne("alami" , "sara" , "casablanca" , 20)
////    personne.UpdateNom("hamid")
////    personne.UpdatePrenom("lbyad")
////    personne.afficherPersonne()
////    println("==== ex 4 :=======")
////    val Form : List<Forme> = listOf(
////        carre(5.1),
////        Rectangle(5.1, 6.1),
////        Cercle(5.1)
////    )
////    Form.forEach {
////        it.afficher_Details()
////    }
//    val avions = listOf(
//        Avion("Boeing" , 2 ),
//        Avion("Water" , 3 )
//    )
//    val voitures = listOf(
//        voiture(2000 , 4),
//        voiture(2020 , 4)
//    )
//    val velos = listOf(
//        velo(2)
//    )
//    println("==== Avion======")
//    avions.forEach {
//        it.afficher_details()
//        it.se_deplace()
//    }
//    println("==== voitures ======")
//    voitures.forEach {
//        it.afficher_details()
//        it.se_deplace()
//    }
//    println("==== vilo ======")
//    velos.forEach {
//        it.afficher_details()
//        it.se_deplace()
//    }
//
//
//
////    AfficherCar()
//}
//
////// TP 2 - Kotlin : correction complete
////
////// Exercice 1
////class MaClasse {
////    val x = 23
////    val y = x + 5
////
////    fun affiche() {
////        println("x = $x")
////        println("y = $y")
////    }
////}
////
////// Exercice 2
////class Personne(
////    var nom: String,
////    var prenom: String,
////    var adresse: String,
////    var age: Int
////) {
////    fun updateNom(nouveauNom: String) {
////        nom = nouveauNom
////    }
////
////    fun updatePrenom(nouveauPrenom: String) {
////        prenom = nouveauPrenom
////    }
////
////    fun updateAge(nouvelAge: Int) {
////        age = nouvelAge
////    }
////
////    fun updateAdresse(nouvelleAdresse: String) {
////        adresse = nouvelleAdresse
////    }
////
////    fun affiche() {
////        println("Personne(nom=$nom, prenom=$prenom, adresse=$adresse, age=$age)")
////    }
////}
////
////// Exercice 3
////class Car(
////    var marque: String,
////    var modele: String,
////    var couleur: String,
////    var kilometrage: Int
////) {
////    fun updateMarque(nouvelleMarque: String) {
////        marque = nouvelleMarque
////    }
////
////    fun updateModele(nouveauModele: String) {
////        modele = nouveauModele
////    }
////
////    fun updateCouleur(nouvelleCouleur: String) {
////        couleur = nouvelleCouleur
////    }
////
////    fun updateKilometrage(nouveauKilometrage: Int) {
////        kilometrage = nouveauKilometrage
////    }
////
////    fun affiche() {
////        println("Car(marque=$marque, modele=$modele, couleur=$couleur, kilometrage=$kilometrage km)")
////    }
////}
////
////// Exercice 4
////abstract class Forme(val nom: String) {
////    abstract fun surface(): Double
////    abstract fun perimetre(): Double
////
////    fun afficherDetails() {
////        println("$nom : surface = ${surface()}, perimetre = ${perimetre()}")
////    }
////}
////
////class Carre(val cote: Double) : Forme("Carre") {
////    override fun surface() = cote * cote
////    override fun perimetre() = 4 * cote
////}
////
////class Rectangle(val longueur: Double, val largeur: Double) : Forme("Rectangle") {
////    override fun surface() = longueur * largeur
////    override fun perimetre() = 2 * (longueur + largeur)
////}
////
////class Cercle(val rayon: Double) : Forme("Cercle") {
////    override fun surface() = Math.PI * rayon * rayon
////    override fun perimetre() = 2 * Math.PI * rayon
////}
////
////// Exercice 5
////open class Vehicule(val marque: String, val modele: String) {
////    open fun afficherDetails() {
////        println("Vehicule : marque=$marque, modele=$modele")
////    }
////
////    open fun seDeplacer() {
////        println("Le vehicule se deplace.")
////    }
////}
////
////class Avion(
////    marque: String,
////    modele: String,
////    val ailes: Int,
////    val nbrRoues: Int
////) : Vehicule(marque, modele) {
////    override fun afficherDetails() {
////        println("Avion : marque=$marque, modele=$modele, ailes=$ailes, roues=$nbrRoues")
////    }
////
////    override fun seDeplacer() {
////        println("L'avion se deplace en volant.")
////    }
////}
////
////class Voiture(
////    marque: String,
////    modele: String,
////    val annee: Int,
////    val nbrRoues: Int
////) : Vehicule(marque, modele) {
////    override fun afficherDetails() {
////        println("Voiture : marque=$marque, modele=$modele, annee=$annee, roues=$nbrRoues")
////    }
////
////    override fun seDeplacer() {
////        println("La voiture se deplace en roulant.")
////    }
////}
////
////class Velo(
////    marque: String,
////    modele: String,
////    val nbrRoues: Int
////) : Vehicule(marque, modele) {
////    override fun afficherDetails() {
////        println("Velo : marque=$marque, modele=$modele, roues=$nbrRoues")
////    }
////
////    override fun seDeplacer() {
////        println("Le velo se deplace en roulant.")
////    }
////}
////
////fun main() {
////    println("=== Exercice 1 ===")
////    MaClasse().affiche()
////
////    println("\n=== Exercice 2 ===")
////    val personne = Personne("Alami", "Sara", "Casablanca", 20)
////    personne.updateNom("Idrissi")
////    personne.updateAge(21)
////    personne.affiche()
////
////    println("\n=== Exercice 3 ===")