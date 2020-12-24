package lessons.warmup1;

public class Warmup10Test {

    public static void main(String[] args) {
        Author author1 = new Author("Mark Twain", "mt@gmail.com", 'm');
        Author author2 = new Author("Jack London", "jl@gmail.com", 'm');
        Author[] authors = new Author[2];
        authors[0] = author1;
        authors[1] = author2;
        System.out.println( "Author name:" +  author1.getName() + ", email: " + author1.getEmail() + ", gender: " + author1.getGender());
        author1.setEmail("Mark@rambler.ru");
        System.out.println("new email: " + author1.getEmail());
        System.out.println(author1.toString());

        Book book1 = new Book("Tom Sawyer", authors, 10.0, 500);
        System.out.println(book1.toString());
        Book book2 = new Book("Adventures of Huckleberry Finn", authors, 13.5);
        System.out.println(book2.toString());
        System.out.println("Book1 name " + book1.getName());
        System.out.println("Book1 author " + book1.getAuthors()[0].getName());
        System.out.println("Book1 price " + book1.getPrice());
        System.out.println("Book1 qty " + book1.getQty());
        book2.setQty(100);
        book2.setPrice(16.8);
        System.out.println(book2.toString());
        System.out.println(book2.getAuthorNames());
    }

}
