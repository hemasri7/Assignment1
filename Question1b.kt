//swapping of 2 numbers without using temporary
import java.util.Scanner
fun main(){
    var scan=Scanner(System.`in`)
    println("Enter the value of a :")
    var a=scan.nextInt()
    println("Enter the value of b :")
    var b=scan.nextInt()
    println("Before swapping the value of a :"+a)
    println("Before swapping the value of b :"+b)
    a=a+b
    b=a-b
    a=a-b
    println("After swapping the value of a :"+a)
    println("After swapping the value of b :"+b)

}