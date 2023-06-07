package com.example.aplikasi_tiket_bis.ui.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.aplikasi_tiket_bis.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class slideAdapter extends RecyclerView.Adapter<slideAdapter.SlideViewHolder>{
    private List<SlideItem> slideItems;
    private ViewPager2 viewPager2;

    public slideAdapter(List<SlideItem> slideItems, ViewPager2 viewPager2) {
        this.slideItems = slideItems;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SlideViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SlideViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.slide_item_container,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull SlideViewHolder holder, int position) {
        holder.setImage(slideItems.get(position));
    }

    @Override
    public int getItemCount() {
        return slideItems.size();
    }

    class SlideViewHolder extends RecyclerView{
        private RoundedImageView imageView;

        SlideViewHolder(@NonNull View itemView){
            super(itemView);
            imageView =itemView.findViewById(R.id.imageSlide);
        }

        void setImage(SlideItem slideItem){
            imageView.setImageResource(slideItem.getImage());
        }
    }
}
