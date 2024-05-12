public class Library {
    String address;
    int numofbooks;
    Book[] book_collection;
    // Add the missing implementation to this class
    public Library(String new_address){
        address=new_address;
        numofbooks=0;
        book_collection=new Book[100];
    }

    public void addBook(Book new_book){
        book_collection[numofbooks]=new_book;
        numofbooks++;
    }

    public static void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress(){
        System.out.println(address);
    }

    public void borrowBook(String title){
        for(int i=0;i<numofbooks;i++){
            if(book_collection[i].getTitle().equals(title)){
                if(book_collection[i].isBorrowed()){
                    System.out.println("sorry,the book is already borrowed.");
                    return;
                }
                else{
                    System.out.println("You successfully borrowed"+" "+book_collection[i].getTitle());
                    book_collection[i].rented();
                    book_collection[i].borrowed= true;
                    return;

                }
            }
        }
        System.out.println("sorry,the book is not in our catalog.");
    }

    public void returnBook(String title){
        for(int i=0;i<numofbooks;i++){
            if(book_collection[i].getTitle().equals(title)){
                if(book_collection[i].isBorrowed()){
                    book_collection[i].returned();
                    numofbooks++;
                    System.out.println("You successfully returned"+" "+book_collection[i].getTitle());
                    return;
                }
                else{
                    System.out.println("sorry,the book is not borrowed.");
                    return;

                }
            }
        }
        System.out.println("sorry,the book is not in our catalog.");

    }
    public void printAvailableBooks(){
        if(numofbooks==0){
            System.out.println("No book in catalog");
        }
        else{
            for(int i=0;i<numofbooks;i++){
                if(!book_collection[i].isBorrowed()){
                    System.out.println(book_collection[i].getTitle());
                }
            }
        }

    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
