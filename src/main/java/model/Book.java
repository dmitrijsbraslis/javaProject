package model;

public class Book {
    private String name;
    private String author;
    private Genre genre;
    private Reader reader = null;

    public Book(String name, String author, Genre genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
}
