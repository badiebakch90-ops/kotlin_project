sealed class Payment ()
class CashPayment(val amount : Number) : Payment()
class CardPayment(val cardNumbre: Number  , val amount: Number) : Payment()
class DigitalPayment(val amount: Number) : Payment()
fun checkPayment(payment : Payment) {
    when(payment){
        is CashPayment -> println("payment cash montant = ${payment.amount}  ")
        is DigitalPayment -> println("Digital Payment ")
        is CardPayment -> println("Card Payment is valid")
    }

}
fun main() {
    checkPayment(CashPayment(42))

}