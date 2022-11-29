package com.book.service

import com.book.model.Book
import com.book.util.BookUtil

class BookService {
    var BookService=BookUtil()

    fun addBook(book:Book){
        BookService.bookInsert(book)
    }
    fun searchByTitle(title:String){
        BookService.searchByTitle(title)
    }
    fun searchByAuthor(author:String){
        BookService.searchByAuthor(author)
    }
    fun display(){
        BookService.displayAllDetails()
    }
    fun bookModify(id:String,column:String,value:String){
        BookService.modifyBook(id,column,value)
    }
    fun deleteBook(bookID: String){
        BookService.delete(bookID)

    }
    fun displaySpecificBookID(bookID:String){
        BookService.displaySpecificBook(bookID)
    }
}