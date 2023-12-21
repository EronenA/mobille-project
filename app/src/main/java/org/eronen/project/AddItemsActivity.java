package org.eronen.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddItemsActivity extends AppCompatActivity {

    private EditText textItems;
    private EditText textAmount;
    private Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items);

        textItems = (EditText) findViewById(R.id.itemEditText);
        textAmount = (EditText) findViewById(R.id.amountEditText);
        addBtn = (Button) findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textItems.length() > 0) {
                    ItemList.getInstance().addItem(new Item(textItems.getText().toString(), Integer.parseInt(textAmount.getText().toString())));
                    textItems.setText("");
                    textAmount.setText("1");
                } else {
                    Toast.makeText(getApplicationContext(), "Type the item you want to add to the shopping list", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

}