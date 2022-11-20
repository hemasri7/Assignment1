//check whether the number is palindrome or not
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
    if(temp==sum)
        println("Palindrome ")
    else
        println(" Not Palindrome")

}