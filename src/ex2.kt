sealed class OperationResult()
class Success (val date : String , val errorMessage: String) : OperationResult()
class Failure ( val errorMessage: String) : OperationResult()
class loading () : OperationResult()

fun detail(operationResult: OperationResult){
    when(operationResult){
        is Success -> println("${operationResult.errorMessage} , ${operationResult.date}")
        is Failure -> println("${operationResult.errorMessage} ")
        is loading -> println("loading ...")
    }

}
