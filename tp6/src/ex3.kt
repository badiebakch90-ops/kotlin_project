

data class Produit(val name: String, val prix : Double , val quantite : Int , val description : String)
fun main(){
    val Produit = Produit("hassan",121.1, 24 ,"hassan")
    println(Produit)
   val  produit2 =Produit.copy(name ="pc" , description = "16/512")
    println(produit2)
    println(Produit==produit2)
}