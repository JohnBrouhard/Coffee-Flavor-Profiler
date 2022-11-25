package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
//import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import java.util.List;
import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Breakfast Blend");
        list.add("Colombia French");
        list.add("Colombia Reserve");
        list.add("Costa Rica La Estrella");
        list.add("Ethiopia Moka");


        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //clicked Breakfast Blend
                    startActivity(new Intent(SearchActivity.this,SubActivity11.class));
                }else if(position==1){
                    //clicked Colombia French
                    startActivity(new Intent(SearchActivity.this,SubActivity1_2.class));
                }else if(position==2){
                    //clicked Colombia Reserve
                    startActivity(new Intent(SearchActivity.this,SubActivity1_3.class));
                }else if(position==3){
                    //clicked Costa Rica La Estrella
                    startActivity(new Intent(SearchActivity.this,SubActivity1_4.class));
                }else{
                    //clicked Ethiopia Moka
                    startActivity(new Intent(SearchActivity.this,SubActivity1_5.class));
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu,menu);

        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Type here");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                arrayAdapter.getFilter().filter(newText);

                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }
}