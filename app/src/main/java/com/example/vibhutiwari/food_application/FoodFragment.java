package com.example.vibhutiwari.food_application;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vibhutiwari on 15/09/16.
 */
public class FoodFragment extends Fragment{

    public final static String ITEMS_COUNT_KEY = "FoodFragment$ItemsCount";
    static String[] itemname ={
            "Food 1",
            "Food 2",
            "Food 3",
            "Food 4",
            "Food 5",
            "Food 6",
            "Food 7",
            "Food 8",
            "Food 9",
            "Food 10",
            "Food 11",
            "Food 12"

    };

    Integer[] imgid={
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9,
            R.drawable.image_10,
            R.drawable.image_11,
            R.drawable.image_12
    };


    public static FoodFragment createInstance(int itemsCount)
    {
        itemsCount=itemname.length;
        FoodFragment foodFragment=new FoodFragment();
        Bundle bundle=new Bundle();
        bundle.putInt(ITEMS_COUNT_KEY,itemsCount);
        foodFragment.setArguments(bundle);
        return foodFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        RecyclerView rv=(RecyclerView)inflater.inflate(R.layout.fragment,container,false);
        setUpRecyclerView(rv);
        return rv;
    }

    private void setUpRecyclerView(RecyclerView rv)
    {
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView.Adapter recyclerAdapter = new FoodAdapter(itemname,imgid);
        rv.setAdapter(recyclerAdapter);
    }

}
