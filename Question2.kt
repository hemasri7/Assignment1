//To check whether the year is leap or not.
import java.util.Scanner
fun main(){
    var scan=Scanner(System.`in`)
    print("Enter the year :")
    var year=scan.nextInt()
    if(year%400==0 || ((year%4==0)&&(year%100!=0))){
        println("This is leap year ")
    }
    else{
        println("This is not leap year")
    }
}