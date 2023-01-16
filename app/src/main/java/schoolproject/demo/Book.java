package schoolproject.demo;

public final class Book {

    private final boolean isAvailable;
    private final String name;

    public Book(String name, boolean isAvailable) {
        this.name = name;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getName() {
        return name;
    }
}
