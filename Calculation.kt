package oops
import java.util.Scanner
class Calculation(num1:Int,num2:Int) {
    var num1:Int=num1
    var num2:Int=num2
    fun add(num1:Int,num2:Int)
    {
        println("Addition of 2 numbers : ${num1+num2}")
    }
    fun sub(num1:Int,num2:Int)
    {
        println("Substraction of 2 numbers : ${num1-num2}")
    }
    fun mul(num1:Int,num2:Int)
    {
        println("Multiplication of 2 numbers : ${num1*num2}")
    }
    fun div(num1:Int,num2:Int)
    {
        println("Division of 2 numbers : ${num1/num2}")
    }
}

fun main(args: Array<String>) {

    var scan=Scanner(System.`in`)
    print("Enter the number :")
    var num1=scan.nextInt()
    print("Enter the number :")
    var num2=scan.nextInt()
    var calculation=Calculation(num1 ,num2)
    println("Select the option to do calculation :\n1)addition\n2)substraction\n3)multiplication\n4)division")
    print("Enter the option you want to calculate the numbers :")
    var option=scan.nextInt()
    when(option)
    {
        1->calculation.add(num1,num2)
        2->calculation.sub(num1,num2)
        3->calculation.mul(num1,num2)
        4->calculation.div(num1,num2)
        else->println("Invalid")
    }
}