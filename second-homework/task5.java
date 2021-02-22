import java.util.Date;

class Author {
    public String firstname;
    public String surname;

    public Author(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    public String toString() {
        return firstname + " " + surname;
    }
}

class Book {
    private String name;
    private Author author;
    private Date release;
    private String publishing_house;
    private String jenre;
    private int pages;

    public Book(String name, Author author, Date release, String publishing_house, String jenre, int pages) {
        this.name = name;
        this.author = author;
        this.release = release;
        this.publishing_house = publishing_house;
        this.jenre = jenre;
        this.pages = pages;
    }

    public void print() {
        System.out.printf("Book's name: %s\n", name);
        System.out.printf("Book's author: %s\n", author.toString());
        System.out.printf("Book's release: %s\n", release.toString());
        System.out.printf("Book's publishing house: %s\n", publishing_house);
        System.out.printf("Book's jenre: %s\n", jenre);
        System.out.printf("Book's pages: %d\n", pages);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public String getPublishing_house() {
        return publishing_house;
    }

    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }

    public String getJenre() {
        return jenre;
    }

    public void setJenre(String jenre) {
        this.jenre = jenre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

public class task5 {
    public static void main(String[] args) {
        Book book = new Book("Mein Kampf",
                new Author("Adolf", "Hitler"),
                new Date(1925, 7, 18),
                "Franz Eher Nachfolger GmbH",
                "Autobiography",
                720);

        book.print();
    }
}
