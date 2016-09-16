package com.example.vibhutiwari.food_application;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vibhutiwari on 15/09/16.
 */
public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{

    String itemName[];
    Integer imgId[];
    private static final int[] COLORS = new int[] {0xFFFF4444 , 0xFF99CC00, 0xFFFFBB33,0xFF33B5E5, 0xFFFF4444,
            0xFF99CC00, 0xFF33B5E5,0xFFFF4444 ,0xFFFFBB33, 0xFF33B5E5,0xFFFF4444 , 0xFF99CC00, 0xFFFFBB33};

    public FoodAdapter(String[] itemName,Integer[] imageId)
    {
        this.itemName=itemName;
        this.imgId=imageId;
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView foodHead;
        TextView foodDesc;
        public ViewHolder(View v,ImageView imgV,TextView t1,TextView t2)
        {
            super(v);
            imageView=imgV;
            foodHead=t1;
            foodDesc=t2;
        }

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.foodHead.setTextColor(Color.WHITE);
        holder.foodHead.setText(itemName[position]);

        holder.foodDesc.setText("Description "+itemName[position]);
        holder.foodDesc.setTextColor(Color.WHITE);

        holder.imageView.setImageResource(imgId[position]);
        holder.itemView.setBackgroundColor(COLORS[position]);
    }

    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view, parent, false);

        ImageView imgv=(ImageView)v.findViewById(R.id.icon);
        TextView t1=(TextView)v.findViewById(R.id.item);
        TextView t2=(TextView)v.findViewById(R.id.textView1);

        ViewHolder vh=new ViewHolder(v,imgv,t1,t2);

        return vh;
    }


    @Override
    public int getItemCount() {
        return itemName.length;
    }
}
