package schoolproject.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final TextView title = findViewById(R.id.title_text);
        final ListView booksList = findViewById(R.id.books_list);
        final EditText searchField = findViewById(R.id.search_field);

        final Category category = DataSource.getCategories()
                .get(getIntent().getIntExtra(Activity_1.CATEGORY_EXTRA, 0));

        title.setText(getString(R.string.list_of_books, category.getName()));

        booksList.setAdapter(new BooksAdapter(category.getBooks()));

        searchField.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                booksList.setAdapter(new BooksAdapter(filterBooks(charSequence.toString(), category)));
            }
        });
    }

    @NonNull
    private List<Book> filterBooks(String query, Category category) {
        final List<Book> books = new ArrayList<>();
        for (final Book book : category.getBooks()) {
            if (book.getName().contains(query)) {
                books.add(book);
            }
        }
        return books;
    }
}
