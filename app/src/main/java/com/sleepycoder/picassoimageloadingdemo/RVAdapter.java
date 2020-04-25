package com.sleepycoder.picassoimageloadingdemo;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {

    Context context;
    String baseurl = "https://raw.githubusercontent.com/revolunet/PythonBooks/master/img/";
    private String[] images = {"Advanced-Machine-Learning-with-Python.jpg", "BMH.png", "Building-Machine-Learning-Systems-with-Python.jpg", "CrackingCodes_cover.png", "Learning-IPython-for-Interactive-Computing-and-Data-Visualization-Second-Edition.png", "Learning-OpenCV-3-Computer-Vision-with-Python-Second-Edition.jpg", "Learning_Python.png", "Mastering-Python.jpg", "Practical Data Analysis.jpg", "Python3-powered.png", "PythonDScover.png", "PythonGuide.png", "RPi_Essentials_eBook2_PythonGames-001.png", "Raspberry Pi Cookbook for Python Programmers.jpg", "What_You_Need_to_Know_about_Machine_Learning.jpg", "What_You_Need_to_Know_about_Python.jpg", "algo_ps_python.png"};

    public RVAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(context).inflate(R.layout.item_row, parent,false);
        return new ViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Picasso.get().load(baseurl + images[position]).into(holder.image);
        holder.url.setText(baseurl + images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView url;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            url = itemView.findViewById(R.id.url);
        }
    }
}
