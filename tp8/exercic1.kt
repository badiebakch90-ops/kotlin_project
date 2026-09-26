//enum class TypeAnimal {
//    TERRESTRE,
//    VOLANT ,
//    AQUATIQUE
//
//}
//interface  Volant{
//    fun voler(): String
//}
//interface Aquatique  {
//    fun nager() : String
//}
//sealed class Animal(open val name:String , open val espece :String ,  val type: TypeAnimal)
//data class Terrestre(
//    override val name: String,
//    override val espece: String
//) : Animal(name, espece, TypeAnimal.TERRESTRE)
//
//data class VolantAnimal(
//    override val name: String,
//    override val espece: String
//) : Animal(name, espece, TypeAnimal.VOLANT), Volant {
//
//    override fun voler(): String {
//        return "$name, espèce $espece, vole."
//    }
//}
//
//data class AquatiqueAnimal(
//    override val name: String,
//    override val espece: String
//) : Animal(name, espece, TypeAnimal.AQUATIQUE), Aquatique {
//
//    override fun nager(): String {
//        return "$name, espèce $espece, nage."
//    }
//}
//
//
//fun ajouterAnimal(parc: MutableList<Animal>, animal: Animal) {
//    parc.add(animal)
//}
//
//fun main() {
//    // La liste des animaux présents dans le parc
//    val animauxDuParc : MutableList<Animal> = mutableListOf()
//
////    val touna = AquatiqueAnimal("touna" , "touna")
////    ajouterAnimal(animauxDuParc , touna )
//
//    val lion = Terrestre("Lion", "Panthera leo")
//    val aigle = VolantAnimal("Aigle", "Aquila")
//    val dauphin = AquatiqueAnimal("Dauphin", "Delphinidae")
//
//    ajouterAnimal(animauxDuParc, lion)
//    ajouterAnimal(animauxDuParc, aigle)
//    ajouterAnimal(animauxDuParc, dauphin)
//
//    println(animauxDuParc)
//    //println(aigle.voler())
//    //println(dauphin.nager())
//}
//
//
