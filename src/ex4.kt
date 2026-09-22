data class Product(val name : String, val price : Int , val quantity : Int)

fun calculerTotal(product :List<Product>){

         println( product.sumOf{it.price * it.quantity})
    
}
fun afficherProduct(product :List<Product>) {
    product.forEach {
        println("Le nom ${it.name} , le price ${it.price} , la quantite ${it.quantity}")

    }
}
fun main(){
    val total = listOf(
        Product("John Smith", 28, 99),
        Product("pc" ,200 , 100 )
    )
   calculerTotal(total)
    afficherProduct(total)
}
