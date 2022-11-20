//swapping of two numbers using temporary variable.
import java.util.Scanner
fun main() {
    var scan=Scanner(System.`in`)
    println("Enter the value of a :")
    var a=scan.nextInt()
    println("Enter the value of b :")
    var b=scan.nextInt()
    println("Before swapping the value of a is :"+a)
    println("Before swapping the value of b is :"+b)
    var temp=a
    a= b
    b=temp
    println("After swapping the value of a is :"+a)
    println("After swapping the value of b is :"+b)

}