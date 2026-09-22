class Library(val libraryName : String){

   inner class Book(val title : String, val authors : String){
        fun afficherBook(){
            println("Le nom de livre : $libraryName \nLe titre livre: $title \nl'autheur de livre:$authors")
        }
    }
}
fun main(){
    val library = Library("AWAKEN the GIANT WITHIN")
    val livre = library.Book("AWAKEN the GIANT WITHIN" , "ANTHONY ROBBINS")
    livre.afficherBook()
}