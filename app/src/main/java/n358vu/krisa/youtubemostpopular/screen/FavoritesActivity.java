package n358vu.krisa.youtubemostpopular.screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.R;
import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.presenter.FavoritesPresenter;
import n358vu.krisa.youtubemostpopular.view.FavoritesView;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
public class FavoritesActivity extends Activity implements FavoritesView {
    @Inject
    FavoritesPresenter favoritesPresenter;

    private ListView sideDrawer;
    private ArrayAdapter<String> sideDrawerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        sideDrawer = (ListView)findViewById(R.id.left_drawer);
        addDrawerItems();

        YoutubeMostPopularApplication.injector.inject(this);
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
                Toast.makeText(FavoritesActivity.this, "Categories - changing.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FavoritesActivity.this, CategoriesActivity.class);
                startActivity(intent);
                break;
            }

            // Favorites
            case 1:  {
                Toast.makeText(FavoritesActivity.this, "Favorites - already here.", Toast.LENGTH_SHORT).show();
                // Already here
                break;
            }

            // About
            case 2:  {
                Toast.makeText(FavoritesActivity.this, "About - changing.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FavoritesActivity.this, AboutActivity.class);
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
        favoritesPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        favoritesPresenter.detachView();
    }

    @Override
    public void showFavorites(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
