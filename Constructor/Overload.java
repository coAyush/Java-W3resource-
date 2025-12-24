/*Write a Java program to create a class called "Book" with instance variables title,
author, and price. Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.*/
public class Overload {
    public static void main(String[] args) {
        System.out.println(new Book());
        System.out.println(new Book("coc",
                "ramarjun"));
        System.out.println(new Book("poc","coc"
                ,95));
    }
}

class Book{
    String title,author;
    float price;
    Book(){

    }
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    Book(String title,String author,float price){
        this.title=title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}