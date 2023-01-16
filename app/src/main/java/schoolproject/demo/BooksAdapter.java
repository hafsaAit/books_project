package schoolproject.demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public final class BooksAdapter extends BaseAdapter {

    private final List<Book> books;

    public BooksAdapter(List<Book> books) {
        this.books = books;
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Book getItem(int i) {
        return books.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.book_item, viewGroup, false);
        }

        view.<TextView>findViewById(R.id.book_title).setText(getItem(i).getName());
        view.<TextView>findViewById(R.id.availability_indicator).setText(
                getItem(i).isAvailable()
                        ? view.getContext().getString(R.string.available)
                        : view.getContext().getString(R.string.unavailable)
        );

        return view;
    }
}
