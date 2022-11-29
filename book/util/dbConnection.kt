package com.book.util

import java.sql.Connection
import java.sql.DriverManager
class dbConnection{

    fun connect():Connection{
        var myurl="jdbc:mysql://localhost:3306/kotlindb"
        var connection=DriverManager.getConnection(myurl,"root","hema")
        return connection
    }
}