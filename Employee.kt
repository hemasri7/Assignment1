package oops
import java.awt.Color
fun main(args: Array<String>) {
    var employee=Employee(1,"Hema",50000,15)
    println(employee.calculatePerDaySalary())
    println(employee.totalSalaryEarned())

}

class Employee {
    var id:Int=0
    var name:String=""
    var salary:Int=0
    var noOfDaysPresent:Int=0

    constructor(id:Int,name:String,salary:Int,noOfDaysPresent:Int)
    {
        this.id=id
        this.name=name
        this.salary=salary
        this.noOfDaysPresent=noOfDaysPresent
    }
    fun calculatePerDaySalary():Int// --> salary/30
    {
        return  salary/30
    }
    fun totalSalaryEarned():Int //noOfDayPresent*calPerDaySalary
    {
        return noOfDaysPresent*calculatePerDaySalary()
    }

}