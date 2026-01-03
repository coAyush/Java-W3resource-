//Write a Java program to create an outer class called Library with an instance variable libraryName.
// Create an inner class Book with a method getLibraryName() that returns the name of the library.
// Instantiate the Book class and call the getLibraryName() method.
public class InnerAccesingOuter {
    public static void main() {
        Library.Book b=new Library().new Book();
        System.out.println(b.getLibraryName());
    }
}

class Library{
    String LibraryName="JAVA";
    class Book{
        public String getLibraryName(){
            return LibraryName;
        }
    }
}