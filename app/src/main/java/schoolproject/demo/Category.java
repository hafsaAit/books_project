package schoolproject.demo;

import java.util.List;

public final class Category {

    private final List<Book> books;
    private final String name;

    public Category(String name, List<Book> books) {
        this.books = books;
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }
}
