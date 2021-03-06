package imwi.milostory.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import imwi.milostory.R;
import imwi.milostory.adapter.ItemAdapter;
import imwi.milostory.model.Item;

public class Activity_Home extends AppCompatActivity {

    private ListView lvItem;
    private List<Item> listItem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_home);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        initData();
        //Bước 2: Tạo adapter ở ví dụ này chúng ta tự tạo một Adapter không phụ thuộc vào Adapter có sẵn
        ItemAdapter adapter = new ItemAdapter(listItem, this);

        //Bước 3: Tạo ListView Sét adapter vào ListView
        lvItem = (ListView) findViewById(R.id.lvItem);
        lvItem.setAdapter(adapter);

        //Bắt sự kiện click vào ListView  dòng bao nhiêu nhận biết thông qua position
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Activity_Home.this, Activity_Profile.class);
                startActivity(intent);
            }
        });
    }


       /* BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_backhome:
                                Intent intent = new Intent(Activity_Home.this, Activity_Home.class);
                                startActivity(intent);
                            case R.id.action_add:
                                Intent intent1 = new Intent(Activity_Home.this, Activity_AddImage.class);
                                startActivity(intent1);
                            case R.id.action_gotouser:
                                Intent intent2 = new Intent(Activity_Home.this, Activity_Profile.class);
                                startActivity(intent2);
                        }
                        return true;
                    }
                });
    }*/



    private void initData() {
        listItem.add(new Item(R.drawable.avatar, "Tin Tin Story"));
        listItem.add(new Item(R.drawable.anh1, "Anna Story"));
        listItem.add(new Item(R.drawable.anh2, "Bin Story"));
        listItem.add(new Item(R.drawable.avatar, "Tin Tin Story"));
        listItem.add(new Item(R.drawable.anh1, "Anna Story"));
        listItem.add(new Item(R.drawable.anh2, "Bin Story"));
    }

 /*   @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        return true;
    }*/
}
