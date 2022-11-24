package collections
fun main() {
    var javabatch= mutableListOf<String>("anil","gopal","ankit","manish")
    var kotlinbatch= mutableListOf<String>("ankit","kumar","manish","rahul")
    println("Adding the 2 lists into 1 list of lements are : ")
    javabatch.addAll(kotlinbatch)
    println(javabatch)
    javabatch.removeAll(kotlinbatch)
    println("To remove the duplicate elements in the list :")
    println(javabatch)
    println("After duplication again add 2 lists into 1 list :")
    javabatch.addAll(kotlinbatch)
    println(javabatch)
    javabatch.sort()
    println("The sort list of elements are :${javabatch}")



}
