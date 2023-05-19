package com.example.bestproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserListItemAdapter extends RecyclerView.Adapter<UserListItemAdapter.ViewHolder>{

    interface OnStateClickListener{
        void onStateClick(UserListItem userListItem, int position);
    }

    //поля адаптера
    private final OnStateClickListener onClickListener;
    private final LayoutInflater inflater;
    private final List<UserListItem> userListItems;

    public UserListItemAdapter(Context context, List<UserListItem> userListItems, OnStateClickListener onClickListener) {
        this.onClickListener = onClickListener;
        this.inflater = LayoutInflater.from(context);
        this.userListItems = userListItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserListItemAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        UserListItem userListItem = userListItems.get(position);
        holder.account.setImageResource(userListItem.getAccount());
        holder.name.setText(userListItem.getName());
        holder.imageView.setImageResource(userListItem.getImageView());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onClickListener.onStateClick(userListItem, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return userListItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView account, imageView;
        final TextView name;

        ViewHolder(View view) {
            super(view);
            account = view.findViewById(R.id.Account);
            imageView = view.findViewById(R.id.imageView);
            name = view.findViewById(R.id.Name);
        }
    }
}
