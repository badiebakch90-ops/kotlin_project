data class User(val id: Number, val name: String , val email: String)
fun listUser(user:List<User>){
    user.filter { it.email.endsWith("@gmail.com") }
        .forEach{println(it.name)}


    }
fun main(){
    val list = listOf<User>(
        User(1 ,"jack" ,"jack@gmail.com"),
        User(2,"alex" ,"alex@icloud.com")
    )
   listUser(list)
}