//To check the number is amstrong or not
import java.util.Scanner

fun main() {
    var scan=Scanner(System.`in`)
    print("Enter the number :")
    var num=scan.nextInt()
    var temp=num
    var str=" "+num
    var len=str.length-1
    var rem:Int
    var sum=0
    while(num>0){
        rem=num%10
        sum=sum+Math.pow(rem.toDouble(),len.toDouble()).toInt()
        num=num/10

    }
    var result=if(sum==temp) "Amstrong" else "Not Amstrong"
    println(result)
}