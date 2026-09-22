interface  Animal {
    val nom : String
    fun parler()
    fun seDeplace()
}
interface Volant{
    fun voler()

}
class Oiseau(
    override val nom : String
): Animal , Volant {
    override fun parler() {
        println("Oiseau chante .")
    }
    override fun seDeplace() {
        println("l'$nom se deplace en l'air")
    }
    override fun voler(){}
}
class Chien(
    override val nom : String
): Animal  {
    override fun parler(){
        println("chien aboie")
    }
    override fun seDeplace() {}

}
class Poisson(
    override val nom : String
): Animal  {
    override fun parler(){
        println("Poisson ne fait pas de bruit.")
    }
    override fun seDeplace() {
        println("Poisson nage.")
    }
}
fun main() {
    Oiseau("oiseau").parler()
    Oiseau("oiseau").seDeplace()
    Chien("chien").parler()
    Poisson("Poisson").parler()
}

