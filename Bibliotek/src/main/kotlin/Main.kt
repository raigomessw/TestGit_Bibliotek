fun main(args: Array<String>) {
    //if(personTa -> true book1.status == true)
    var book1 = Book("The dragon", "Johan Josson", 1995, 2, true)
    var book2 = Book("The Village", "Julia Gustaf", 2000, 3, true)
    var book3 = Book("Eragon", "Pedro Hansson", 2002, 1, true)

    //List av Books
    var bookList = mutableListOf(book1, book2, book3)
    for (book in bookList) {
        println("Book name: ${book.namn}, År: ${book.år}, Status: ${book.status}")
    }

    //Book1
    for (book in bookList)  {
        if (book1.status == true) {
            println("Booken är tillgänglig!")
        } else {
            println("Booken är otillgänglig")
        }
    }
    //Book 2
    for (book in bookList) {
        if (book2.status == true) {
            println("Booken är tillgänglig!")
        } else {
            println("Booken är otillgänglig")
        }
        //Book 3
        for (book in bookList) {
            if (book3.status == true) {
                println("Booken är tillgänglig!")
            } else {
                println("Booken är otillgänglig")
            }
        }

        fun personTa(personTa: Boolean = true) {
            personTa
        }
    }
}

















