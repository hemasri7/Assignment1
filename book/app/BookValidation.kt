package com.book.app
import com.book.model.*
class BookValidation{
    // validation for price
    fun validatePrice(price:Float){
        if(price<0)
        {
            throw InvalidBookException("Invalid Book Exception $price Do not enter Negative values")
        }
    }

    //validation for category
    fun validateCategory(category: String){
        if(category!="Science" && category!="Others" && category!="Fiction" && category!="Technology")
        {
            throw InvalidBookException("Invalid Book Exception $category must be science or others or fiction or technology")
        }
    }
    //validate for bookid
    fun validateBookID(bookID:String){
        if(!(bookID.startsWith('B') && bookID.length==4)){
            throw InvalidBookException("Invalid book exception $bookID book id strat with captial B and length should be 4")
        }
    }
}