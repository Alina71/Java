package HW;
/*
Library Management System:

Create a base class Book with attributes like title, author, and ISBN.
Develop two subclasses: EBook and PrintBook. In EBook, add a property for
 download_link, and in PrintBook, add a property for number_of_copies.
Implement a method in each subclass that displays book details.
Instantiate objects from these classes and demonstrate the display functionality.
 */
public class Book {
    private String title;
    private String author;
    private int ISBN;

    public void printInfo() {
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("ISBN:"+ISBN);
    }
        public Book(String title,String author,int ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;

    }
}
class Ebook extends Book{
    private String downloadLink;
    Ebook(String title,String author,int ISBN,String downloadLink){
        super(title, author, ISBN);
       this.downloadLink=downloadLink;
        }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("please downloadLink of the book on "+downloadLink);
        System.out.println("*******************************");
    }

}

class PrintBook extends Book{
    private int numberOfCopies;
    PrintBook(String title,String author,int ISBN,int numberOfCopies){
        super(title, author, ISBN);
        this.numberOfCopies=numberOfCopies;

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Print "+numberOfCopies+" copies");
    }
}