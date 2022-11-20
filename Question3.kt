//Factorial number
import java.util.Scanner

fun main() {
    var scan=Scanner(System.`in`)
    println("Enter the number :")
    var factNo=scan.nextInt()
    var sum=1
    for(i in 1..factNo){
        if(factNo==0)
            print(1)
        else
            sum*=i
    }
    println("The factorial of a number $factNo is :$sum")
}