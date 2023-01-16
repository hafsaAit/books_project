package schoolproject.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Activity_1 extends AppCompatActivity {

    public static final String CATEGORY_EXTRA = "category_index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        final ListView categoriesList = findViewById(R.id.categories_list);
        categoriesList.setAdapter(new CategoriesAdapter(DataSource.getCategories()));

        categoriesList.setOnItemClickListener((adapterView, view, i, l) ->
                startActivity(new Intent(Activity_1.this, Activity_2.class)
                        .putExtra(CATEGORY_EXTRA, i)));
    }
}
