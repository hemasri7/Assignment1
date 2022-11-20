//Using for loop to print even numbers between 1 to 20
fun main() {
    print("The even numbers are :")
    for(i in 1..20){
        if(i%2==0){
            print("$i " )
        }
    }
}