package exceptions

import java.lang.Exception
import java.util.Scanner

fun main(args: Array<String>) {
    var scan=Scanner(System.`in`)
    print("Enter the age :")
    var age=scan.nextInt()
    try{
        checkAgeForVote(age)
    }
    catch (e:Exception)
    {
        println(e.message)
    }

}

fun checkAgeForVote(age:Int)
{
    if(age>18)
    {
        println("You are eligible for vote")
    }
    else
    {
        throw Exception("You are not eligible for vote")
    }
}