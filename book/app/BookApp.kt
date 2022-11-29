package com.book.app
import com.book.model.Book
import java.util.Scanner
import com.book.service.*
import com.book.util.*


fun main() {
    var bookService=BookService()
    var bookValidation=BookValidation()
    var scanner=Scanner(System.`in`)
    while(true) {
        println(
            "1. Add book\n"+ "2. Modify book details\n" +
                    "3. Delete book details\n" +
                    "4. Display All the book details\n" +
                    "5. Display specific book details\n" +
                    "6. Search book by title\n" +
                    "7. Search book by author\n" +
                    "8. Exit"
        )
        println("----------------------------------------------------------------------------------------")
        print("Enter the choice :")
        var choice = scanner.nextInt()
        when (choice) {
            1-> {
                print("Enter the bookId :")
                var bookID = scanner.next()
                try{
                    bookValidation.validateBookID(bookID)
                }
                catch(e:InvalidBookException){
                    println(e.message)
                }
                print("Enter the title :")
                var title=scanner.nextLine()
                scanner.next()
                print("Enter the author :")
                var author=scanner.nextLine()
                scanner.next()
                print("Enter the category :")
                var category=scanner.next()
                try {
                    bookValidation.validateCategory(category)
                }
                catch (e:InvalidBookException){
                    println(e.message)
                }
                print("Enter the price :")
                var price=scanner.nextFloat()
                try {
                    bookValidation.validatePrice(price)
                }
                catch (e:InvalidBookException){
                    println(e.message)
                }
                var book=Book(bookID, title, author, category, price)
                bookService.addBook(book)
                break

            }
            2->{
                println("Enter book Id to modify")
                var id=scanner.nextLine()
                println("Enter which column you want to edit")
                var column=scanner.nextLine()
                println("Enter which the value to be updated")
                var value=scanner.nextLine()

                bookService.bookModify(id,column,value)

            }
            3->{
                print("Enter the bookId :")
                var bookID=scanner.next()
                bookService.deleteBook(bookID)

            }
            4->{
                bookService.display()
            }
            5->{

            }
            6->{
                print("Enter the book title you want to search :")
                var title=scanner.nextLine()
                bookService.searchByTitle(title)
            }
            7->{
                print("Enter the book author you want to search :")
                var author=scanner.nextLine()
                bookService.searchByAuthor(author)
            }
            8->{
                //exit
                System.exit(0)
            }
            else->{
                println("Enter wrong details ")
                break
            }


            

        }
    }
}