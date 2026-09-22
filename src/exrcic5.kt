class Box {
    val size ="size"
    inner class Item{
        val name = "name"
        fun printDetails(){
            println("Name: $name ")
            println("Size: $size ")
        }
    }
}
fun main(){
    val box = Box()
    var item = box.Item()
    item.printDetails()
}