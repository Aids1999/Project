package com.example.bestproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Review> reviews;

    public ReviewAdapter(Context context, List<Review> animals) {
        this.inflater = LayoutInflater.from(context);
        this.reviews = animals;
    }

    @Override
    public ReviewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_review, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReviewAdapter.ViewHolder holder, int position) {
        Review review = reviews.get(position);
        holder.avatarView.setImageResource(review.getAvatarResource());
        holder.nameView.setText(review.getName());
        holder.reviewTextView.setText(review.getReviewText());
    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView avatarView;
        final TextView nameView, reviewTextView;

        ViewHolder(View view) {
            super(view);
            avatarView = view.findViewById(R.id.userPic);
            nameView = view.findViewById(R.id.nameUser);
            reviewTextView = view.findViewById(R.id.textReview);
        }
    }
}
