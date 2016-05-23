package n358vu.krisa.youtubemostpopular.screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import n358vu.krisa.youtubemostpopular.R;
import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;

/**
 * Created by kkrisst on 23/05/2016.
 */
public class AboutActivity extends Activity {

    private ListView sideDrawer;
    private ArrayAdapter<String> sideDrawerAdapter;

    private Tracker mTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        sideDrawer = (ListView)findViewById(R.id.left_drawer);
        addDrawerItems();

        YoutubeMostPopularApplication.injector.inject(this);

        YoutubeMostPopularApplication application = (YoutubeMostPopularApplication) getApplication();
        mTracker = application.getDefaultTracker();

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
                Toast.makeText(AboutActivity.this, "Categories - changing.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AboutActivity.this, CategoriesActivity.class);
                startActivity(intent);
                break;
            }

            // Favorites
            case 1:  {
                Toast.makeText(AboutActivity.this, "Favorites - changing.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AboutActivity.this, FavoritesActivity.class);
                startActivity(intent);
                break;
            }

            // About
            case 2:  {
                Toast.makeText(AboutActivity.this, "About - already here.", Toast.LENGTH_SHORT).show();
                // Already here
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
        mTracker.setScreenName("About");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
