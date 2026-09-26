import java.util.LinkedList

//fun String.containsSubstring(subString: String): Boolean {
//    return this.contains(subString)
//}
//fun main (){
//    val chaine1="premiere caractere"
//    println(chaine1.containsSubstring("caractere"))
//}

//ex2
//fun main(){
//    val list = mutableListOf<String>("one","two","three","four","five","six")
//    list.add("nane")
//    list.remove("three")
//    list.removeAt(1)
//    println(list)
//    println(list.contains("one"))
//
//}

//Exercic3:
//fun main(){
//    val set = mutableSetOf<Number>(1,2,3.3,5,8)
//    set.add(5)
//    set.remove(3)
//    println(set.contains(6))
//    println(set)

//}
//exrcice4 :

//fun main() {
//    val map = mutableMapOf<String, Int>(
//        "pato" to 29 ,"perlo" to 25 , "Messi" to 26
//    )
//    map.put("Cristiano", 29)
//    println(map["Messi"])
//    println(map)
//    println("keys of map : ${map.keys}")
//    println("value of map :${map.values}")
//
//}

//exercice 5
fun main(){
    var list = mutableListOf<Int>(4,2,5,1,3)
    list.sort()
    listOf(list)
    list.sorted()
    println(list)
}




