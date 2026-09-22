//enum class OrderStatus {
//    PENDING , SHIPPED , DELIVERED , CANCELLED
//}
//class Order(var status: OrderStatus) {
//    fun changeStatus() {
//
//        status =  when (status) {
//            OrderStatus.PENDING ->  OrderStatus.SHIPPED
//            OrderStatus.SHIPPED -> OrderStatus.DELIVERED
//            OrderStatus.DELIVERED -> OrderStatus.DELIVERED
//            OrderStatus.CANCELLED -> OrderStatus.CANCELLED
//        }}
//    }
//
//fun main (){
//    val order = Order(OrderStatus.PENDING)
//    println(order.status)
//    order.changeStatus()
//    println(order.status)
//    order.changeStatus()
//    println(order.status)
//    order.changeStatus()
//    println(order.status)
//
//}