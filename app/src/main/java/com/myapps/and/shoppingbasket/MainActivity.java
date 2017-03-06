package com.myapps.and.shoppingbasket;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> itemsArray = new ArrayList<>();
        itemsArray.add("Tomato");
        itemsArray.add("Onion");
        itemsArray.add("Pepper");
        itemsArray.add("Bannana");
        itemsArray.add("Apple");
        itemsArray.add("Carrot");

        ListView lv= (ListView) findViewById(R.id.itemsLV);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,itemsArray);
        lv.setAdapter(adapter);

        final CartFragment cartFragment = new CartFragment();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.addToCartFrag,cartFragment);
        transaction.commit();

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // On click add items to cart
                cartFragment.addToCart();
            }
        });
    }
}
