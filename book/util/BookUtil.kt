package com.book.util

import com.book.model.Book

class BookUtil {
    var dbConnection=dbConnection()
    var connection=dbConnection.connect()
    var books= mutableListOf<Book>()

    fun bookInsert(book: Book){
        var preparedStatement=connection.prepareStatement("insert into Book values(?,?,?,?,?)")
        preparedStatement.setString(1,book.bookID)
        preparedStatement.setString(2,book.title)
        preparedStatement.setString(3,book.author)
        preparedStatement.setString(4,book.category)
        preparedStatement.setFloat(5,book.price)
        var result=preparedStatement.executeUpdate()
        if(result>0){
            println("Inserted")
        }
        else{
            println("Not Inserted")
        }

    }

    fun displayAllDetails(){
        var preparedStatement=connection.prepareStatement("select * from Book")
        var res=preparedStatement.executeQuery()
        while(res.next()){
            var bookID=res.getString("bookID")
            var title=res.getString("title")
            var author=res.getString("author")
            var category=res.getString("category")
            var price=res.getFloat("price")
            books.add(Book(bookID,title,author, category, price))
        }
        for(book in books){
            println(book)
        }

    }
    fun searchByTitle(title:String){
        var preparedStatement=connection.prepareStatement("select * from Book where title=(?)")
        val res=preparedStatement.executeQuery()
        while(res.next()){
            var bookID=res.getString("bookID")
            var title=res.getString("title")
            var author=res.getString("author")
            var category=res.getString("category")
            var price=res.getFloat("price")
            books.add(Book(bookID,title,author, category, price))
        }
        for(book in books){
            println(book)
        }


    }
    fun searchByAuthor(author:String){
        var preparedStatement=connection.prepareStatement("select * from Book where author=(?)")
        val res=preparedStatement.executeQuery()
        while(res.next()){
            var bookID=res.getString("bookID")
            var title=res.getString("title")
            var author=res.getString("author")
            var category=res.getString("category")
            var price=res.getFloat("price")
            books.add(Book(bookID,title,author, category, price))
        }
        for(book in books){
            println(book)
        }


    }
    fun delete(bookID:String){
        var preparedStatement=connection.prepareStatement("delete from Book where bookID=?")
        preparedStatement.setString(1,bookID)
        var res=preparedStatement.executeUpdate()
        if(true){
            println("Deleted")
        }
        else{
            println("Not Deleted")
        }
    }

    fun displaySpecificBook(bookID: String)
    {
        val prestmt=connection.prepareStatement("select * from books where bookId=? ")
        prestmt.setString(1,bookID)
        val result=prestmt.executeQuery()
        val books= mutableListOf<Book>()
        while(result.next()){
            val bookId=result.getString("bookId")
            val title=result.getString("title")
            val author=result.getString("author")
            val category=result.getString("category")
            val price=result.getFloat("price")
            books.add(Book(bookId,title,author,category,price))
        }
        for(book in books){
            println(book)
        }
    }
    fun modifyBook(id:String,column:String,value:String){
        var message=""
        if(column=="title"){
            val preparedStatement=connection.prepareStatement("update Book set title=? where bookID=?")
            preparedStatement.setString(1,value)
            preparedStatement.setString(2,id)
            val res=preparedStatement.executeUpdate()
            if(res>0)
                message="title modified"

        }
        else if(column=="author"){
            val preparedStatement=connection.prepareStatement("update Book set author=? where bookID=?")
            preparedStatement.setString(1,value)
            preparedStatement.setString(2,id)
            val res=preparedStatement.executeUpdate()
            if(res>0)
                message="author modified"
        }
        else if(column=="category"){
            val preparedStatement=connection.prepareStatement("update Book set category=? where bookID=?")
            preparedStatement.setString(1,value)
            preparedStatement.setString(2,id)
            val res=preparedStatement.executeUpdate()
            if(res>0)
                message="category modified"
        }
        else if(column=="price"){
            val preparedStatement=connection.prepareStatement("update Book set price=? where bookID=?")
            preparedStatement.setFloat(1,value.toFloat())
            preparedStatement.setString(2, id)
            val res=preparedStatement.executeUpdate()
            if(res>0)
                message="price modified"
        }
        else{
            message="book not found"
        }
        println( message)
    }



}
