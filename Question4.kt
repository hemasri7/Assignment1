//Fibonacci series
import java.util.Scanner

fun main() {
    var scan=Scanner(System.`in`)
    println("Enter the range of the series :")
    var num=scan.nextInt()
    var a=0
    var b=1
    var c=0
    print("The fibonacci series is :"+a +" "+ b+" ")
    for( i in 2..num){
        c=a+b
        print("$c ")
        a=b
        b=c
    }
}