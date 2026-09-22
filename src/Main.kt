////sealed class Payment
////class CashPayment(val montant: Number): Payment()
////class CardPayment(val amount : Number , val cartNumber: Number ) : Payment()
////class DigitalPayment (val amount : Number , val cartNumber: Number ): Payment()
////fun check(payment: Payment){
////    when(payment){
////        is CashPayment -> println("Cash Payment:${payment.montant} is checked")
////        is CardPayment -> println("Card Payment Numbre :${payment.cartNumber} is checked with montant : ${payment.amount} ")
////        is DigitalPayment -> println("Digital Cart : ${payment.cartNumber} Payment is checked with montant : ${payment.amount} ")
////    }
////}
//// ex2
//// sealed class OperationResult
////class Success(val data : String ) : OperationResult()
////class Failure(val errorMessage : String) : OperationResult()
////class Loading : OperationResult()
////fun check( operationResult : OperationResult) {
////    when( operationResult ) {
////        is Success -> println("Success ${operationResult.data}")
////        is Failure -> println("Failure ${operationResult.errorMessage}")
////        is Loading -> println("Loading...")
////    }
////}
//// ex3
////data class User(
////    val id: Int,
////    val name: String,
////    val email: String
////)
////
////
////fun listUser( list : List<User>) {
////    list.filter {it.email.endsWith("@gmail.com")
////        }
////    .forEach {println(it.name) }
////}
//
//// ex4
//data class Product(val name: String, val price: Double ,val  quantity: Double)
//
//fun sumProduit(product: List<Product>) : Number {
//     return product.sumOf{ it.price }
//
//}
//
//fun afficherProduct(product: List<Product>) {
//    product.forEach {
//        println("name : ${it.name} , price: ${it.price} , quantiter : ${it.quantity} pieces")
//    }
//}
//
//
//
//fun main() {
////    check(CashPayment(2.34))
////    check(CardPayment(5000 , 23253433234))
////    check(DigitalPayment(40000 , 23253433234))
//    //ex 2
////    check(operationResult = Success("donnee récupérées"))
////    check(operationResult = Failure("errur de connection " ))
////    check(operationResult = Loading())
//
//    // ex3
////val user = listOf(User(1, "Alex", "exmpl@icloud.com"),
////    User(1, "imad", "ex2@gmail.com"),
////    User(2 ,"brahim" , "exmp3@outlook.com")
////    )
////    listUser(user)
//    //ex4
//    val listOfProducts = listOf(
//        Product("pc"         , 1000.0 , 80.0 ),
//        Product("smartphone" , 2000.0 , 60.0 ),
//        Product("tablet"     , 400.0  , 100.0 ))
//
//     afficherProduct(listOfProducts)
//    println("la somme : ${sumProduit(listOfProducts)}")
//}
