package com.myapps.and.shoppingbasket;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CartFragment extends Fragment {

    int itemsCount=0;
    TextView itemsTV;

    public CartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);


        return view;
    }

    public void addToCart() {
        itemsTV= (TextView) getActivity().findViewById(R.id.itemsTV);
        itemsCount++;
        itemsTV.setText(""+itemsCount);

    }

}
