package schoolproject.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class DataSource {

    private static final List<Category> categories = Collections.unmodifiableList(Arrays.asList(
            new Category("Computer science", Arrays.asList(
                    new Book("Title 1", true),
                    new Book("Title 2", true),
                    new Book("Title 3", false),
                    new Book("Title 4", true),
                    new Book("Title 5", true),
                    new Book("Title 6", false),
                    new Book("Title 7", false),
                    new Book("Title 8", true),
                    new Book("Title 9", true),
                    new Book("Title 10", false),
                    new Book("Title 11", true),
                    new Book("Title 12", true)
            )),
            new Category("Physics", Arrays.asList(
                    new Book("Title 1", true),
                    new Book("Title 2", true),
                    new Book("Title 3", false),
                    new Book("Title 4", true),
                    new Book("Title 5", true),
                    new Book("Title 6", false),
                    new Book("Title 7", false),
                    new Book("Title 8", true),
                    new Book("Title 9", true),
                    new Book("Title 10", false),
                    new Book("Title 11", true),
                    new Book("Title 12", true)
            )),
            new Category("Biology", Arrays.asList(
                    new Book("Title 1", true),
                    new Book("Title 2", true),
                    new Book("Title 3", false),
                    new Book("Title 4", true),
                    new Book("Title 5", true),
                    new Book("Title 6", false),
                    new Book("Title 7", false),
                    new Book("Title 8", true),
                    new Book("Title 9", true),
                    new Book("Title 10", false),
                    new Book("Title 11", true),
                    new Book("Title 12", true)
            )),
            new Category("Arabic", Arrays.asList(
                    new Book("Title 1", true),
                    new Book("Title 2", true),
                    new Book("Title 3", false),
                    new Book("Title 4", true),
                    new Book("Title 5", true),
                    new Book("Title 6", false),
                    new Book("Title 7", false),
                    new Book("Title 8", true),
                    new Book("Title 9", true),
                    new Book("Title 10", false),
                    new Book("Title 11", true),
                    new Book("Title 12", true)
            )),
            new Category("English", Arrays.asList(
                    new Book("Title 1", true),
                    new Book("Title 2", true),
                    new Book("Title 3", false),
                    new Book("Title 4", true),
                    new Book("Title 5", true),
                    new Book("Title 6", false),
                    new Book("Title 7", false),
                    new Book("Title 8", true),
                    new Book("Title 9", true),
                    new Book("Title 10", false),
                    new Book("Title 11", true),
                    new Book("Title 12", true)
            )),
            new Category("Chemistry", Arrays.asList(
                    new Book("Title 1", true),
                    new Book("Title 2", true),
                    new Book("Title 3", false),
                    new Book("Title 4", true),
                    new Book("Title 5", true),
                    new Book("Title 6", false),
                    new Book("Title 7", false),
                    new Book("Title 8", true),
                    new Book("Title 9", true),
                    new Book("Title 10", false),
                    new Book("Title 11", true),
                    new Book("Title 12", true)
            ))
    ));

    public static List<Category> getCategories() {
        return categories;
    }
}
