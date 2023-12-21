package org.eronen.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ItemList itemlist = ItemList.getInstance();
        Button shoppingListBtn = (Button) findViewById(R.id.shoppingListBtn);
        Button addItemsBtn = (Button) findViewById(R.id.addItemsBtn);

        shoppingListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ItemList.getInstance().getItems().size() > 0) {
                    Intent intent = new Intent(getApplicationContext(), ShoppingListActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Shopping list is empty!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        addItemsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddItemsActivity.class);
                startActivity(intent);
            }
        });

    }


}