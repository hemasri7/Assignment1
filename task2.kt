package collections

fun main() {
    var javabatch = mutableSetOf<String>("anil", "gopal", "ankit", "manish")
    var kotlinbatch = mutableSetOf<String>("ankit", "kumar", "manish", "rahul")
    println("Adding the 2 lists into 1 list of lements are : ")
    javabatch.addAll(kotlinbatch)
    println(javabatch.sorted())


}
