package exceptions

import java.lang.ArithmeticException
import java.util.InputMismatchException
import java.util.Scanner

fun main(args: Array<String>) {
    var scan=Scanner(System.`in`)
    try{
        print("Enter the number :")
        var num1=scan.nextInt()
        print("Enter the number :")
        var num2=scan.nextInt()
        var result=0
        try {
            result = num1 / num2
            println("The result is :$result")
        } catch (e: ArithmeticException) {
            println("Do not enter / 0")
        }
    }
    catch (e:InputMismatchException)
    {
        println("You enter number ")
    }
    finally {
        print("Thank you")
    }
}