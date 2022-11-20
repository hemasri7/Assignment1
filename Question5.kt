//Reverse of a number
import java.util.Scanner

fun main() {
    var scan=Scanner(System.`in`)
    print("Enter the number :")
    var num=scan.nextInt()
    var temp=num
    var rem:Int
    var sum=0
    while (num>0){
        rem=num%10
        sum=(sum*10)+rem
        num=num/10
    }
    println("The reverse of a $temp number  :"+sum)

}