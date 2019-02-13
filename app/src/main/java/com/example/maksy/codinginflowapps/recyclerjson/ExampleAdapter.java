package com.example.maksy.codinginflowapps.recyclerjson;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maksy.codinginflowapps.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static com.example.maksy.codinginflowapps.recyclerjson.JsonTest.TAG;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private Context context;
    private ArrayList<ExampleItem> mExampleItem;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public ExampleAdapter(Context context, ArrayList<ExampleItem> mExampleItem) {
        this.context = context;
        this.mExampleItem = mExampleItem;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.recycler_item, viewGroup, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        ExampleItem currentItem = mExampleItem.get(i);

        String imageUrl = currentItem.getmImageUrl();
        String creatorName = currentItem.getmCreator();
        int likeCount = currentItem.getLikeCount();

        exampleViewHolder.mTextViewCreator.setText(creatorName);
        exampleViewHolder.mTextViewLikes.setText("Likes: " + likeCount);
        Picasso.get().load(imageUrl).fit().centerInside().into(exampleViewHolder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mExampleItem.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextViewCreator, mTextViewLikes;


        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.recycler_image_view);
            mTextViewCreator = itemView.findViewById(R.id.recycler_text_view_creator);
            mTextViewLikes = itemView.findViewById(R.id.recycler_text_view_like);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null) {
                        int pos = getAdapterPosition();
                        if(pos != RecyclerView.NO_POSITION){
                            listener.onItemClick(pos);
                            Log.d(TAG, "onClick: ");
                        }
                    }
                }
            });
        }
    }
}
