package org.eronen.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ShoppingListActivity extends AppCompatActivity {

    private ItemList itemlist;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        itemlist = ItemList.getInstance();
        recyclerView = findViewById(R.id.rvShoppingList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemListAdapter(getApplicationContext(), itemlist.getItems()));


    }


}