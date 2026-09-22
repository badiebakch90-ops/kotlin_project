

abstract class Forme(val nom: String){
    abstract fun surface() :Double

    abstract fun perimetre( ) : Double
    fun affichier(){ println ("nom : $nom ,\nsurface : ${surface()} ,\nperimetre: ${perimetre()}")
    }
}
class Carre (nom: String ,val x: Double ) :Forme(nom){
    override fun surface() = x * x
    override fun perimetre() = 4 * x
}

fun main() {
    val carre = Carre(nom="carre", x=40.0)
    carre.affichier()
}
