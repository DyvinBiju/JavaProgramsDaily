class LibraryItem {
    public String title;
    protected String author;
    private double price;

    public LibraryItem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Book extends LibraryItem {
    String publisher;
    int edition;

    public Book(String title, String author, double price,
                String publisher, int edition) {
        super(title, author, price);
        this.publisher = publisher;
        this.edition = edition;
    }

    public void displayBook() {
        System.out.println("Book Details");
        System.out.println("------------");
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Publisher  : " + publisher);
        System.out.println("Edition    : " + edition);
        System.out.println("Price      : " + getPrice());
    }
}

public class LibraryBookDemo {
    public static void main(String[] args) {
        Book book = new Book(
                "Java Programming",
                "Herbert Schildt",
                650.0,
                "McGraw Hill",
                12);

        book.displayBook();
    }
}