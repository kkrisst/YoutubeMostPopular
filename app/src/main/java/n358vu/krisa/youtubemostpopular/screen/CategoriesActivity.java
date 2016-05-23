package n358vu.krisa.youtubemostpopular.screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.R;
import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.adapter.CategoryAdapter;
import n358vu.krisa.youtubemostpopular.model.Category;
import n358vu.krisa.youtubemostpopular.presenter.CategoriesPresenter;
import n358vu.krisa.youtubemostpopular.view.CategoriesView;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
public class CategoriesActivity extends Activity implements CategoriesView {
    @Inject
    CategoriesPresenter categoriesPresenter;

    private ListView sideDrawer;
    private ArrayAdapter<String> sideDrawerAdapter;

    private RecyclerView recyclerViewCategories;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        YoutubeMostPopularApplication.injector.inject(this);

        sideDrawer = (ListView)findViewById(R.id.left_drawer);
        addDrawerItems();

        recyclerViewCategories = (RecyclerView) findViewById(R.id.recyclerViewCategories);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewCategories.setLayoutManager(llm);

        categoryAdapter = new CategoryAdapter(getApplicationContext());
        recyclerViewCategories.setAdapter(categoryAdapter);

        categoriesPresenter.showCategories();

    }

    private void addDrawerItems() {
        String[] menuItems = getResources().getStringArray(R.array.side_drawer_items);
        sideDrawerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menuItems);
        sideDrawer.setAdapter(sideDrawerAdapter);

        sideDrawer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectItem(position);
            }
        });
    }

    private void selectItem(int position) {
        switch (position) {
            // Categories
            case 0:  {
                // Already here
                Toast.makeText(CategoriesActivity.this, "Categories - already here.", Toast.LENGTH_SHORT).show();
                break;
            }
            // Favorites
            case 1:  {
                Toast.makeText(CategoriesActivity.this, "Favorites - changing.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CategoriesActivity.this, FavoritesActivity.class);
                startActivity(intent);
                break;
            }
            // About
            case 2:  {
                Toast.makeText(CategoriesActivity.this, "About - changing.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CategoriesActivity.this, AboutActivity.class);
                startActivity(intent);
                break;
            }
            default: {
                // Not needed
                break;
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        categoriesPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        categoriesPresenter.detachView();
    }

    @Override
    public void showCategories(List<Category> categories) {
        categoryAdapter.setCategoryList(categories);
    }

    @Override
    public void testMethod(String testMessage) {
        System.out.println("Activity-bol:");
        System.out.println(testMessage);
    }

}
