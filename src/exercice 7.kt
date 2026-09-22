import OrderStatus.*

enum class OrderStatus {
    PENDING ,
    SHIPPED ,
    DELIVERED ,
    CANCELLED
}
class Order(var status: OrderStatus) {
    fun changeStatu(){
       status = when(status){
            OrderStatus.PENDING -> OrderStatus.SHIPPED
            OrderStatus.SHIPPED -> OrderStatus.DELIVERED
            OrderStatus.DELIVERED -> OrderStatus.CANCELLED
            OrderStatus.CANCELLED -> OrderStatus.PENDING
        }
    }
}

fun main(){

    val order1 = Order(OrderStatus.PENDING)
    println(order1.status)
    order1.changeStatu()
    println(order1.status)

}