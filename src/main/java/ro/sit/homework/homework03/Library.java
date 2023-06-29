package ro.sit.homework.homework03;

public class Library {

    public static void main(String[] args) {
        Author author = new Author("Andrei Ruse" , "andreir.gmail.com");
        Book book = new Book("Zaraza", 2014, author, 50);


        System.out.println("Book: " + book.getName() +" (" + book.getPrice() + " RON) " +
                "by author: " + book.getAuthor().name + ", published in " + book.getYear());

    }
}
