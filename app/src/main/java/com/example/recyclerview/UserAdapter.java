package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    // Ta metoda tworzy nowy ViewHolder, gdy RecyclerView go potrzebuje.
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_user, parent, false);
        return new UserViewHolder(view);
    }

    // Ta metoda wypełnia ViewHolder danymi dla określonej pozycji na liście.
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User currentUser = userList.get(position);
        holder.firstNameText.setText(currentUser.getFirstName());
//        holder.lastNameText.setText(currentUser.getLastName());
    }

    // Ta metoda zwraca liczbę elementów na liście.
    @Override
    public int getItemCount() {
        return userList.size();
    }

    // Wewnętrzna klasa ViewHolder przechowuje referencje do widoków wiersza.
    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public TextView firstNameText;
        public TextView lastNameText;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            firstNameText = itemView.findViewById(R.id.firstNameText);
            lastNameText = itemView.findViewById(R.id.lastNameText);
        }
    }
}