package lessons.warmup1;

public class Book {
    private String name;
 //   private Author author;
    private  Author[] authors;
    private double price;
    private int qty =0;

    public Book(String name, Author[] authors, double price){
        this.name = name;
 //       this.author = author;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        // this.author = author;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
//    public Author getAuthor() {
//        return author;
//    }


    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorNames(){
        String result = "";
        for(int i = 0; i < authors.length; i++){
            result += authors[i].getName();
            if(i < authors.length-1) {
                result += ", ";
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String authors = "";
        for(int i = 0; i < this.authors.length; i++){
            authors += this.authors[i].toString();
            if(i < this.authors.length-1) {
                authors += ", ";
            }
        }
        return "Book[" +
                "name= " + name +
                ", authers =  {" + authors + "}" +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }
}
