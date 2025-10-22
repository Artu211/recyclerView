package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.UserViewHolder> {

    private List<Product> productList;

    public ProductAdapter(List<Product> productList) {
        this.productList = productList;
    }

    // Ta metoda tworzy nowy ViewHolder, gdy RecyclerView go potrzebuje.
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_product, parent, false);
        return new UserViewHolder(view);
    }

    // Ta metoda wypełnia ViewHolder danymi dla określonej pozycji na liście.
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        Product currentUser = productList.get(position);
        holder.productText.setText(currentUser.getProduct());
        holder.priceText.setText((int) currentUser.getPrice());
    }

    // Ta metoda zwraca liczbę elementów na liście.
    @Override
    public int getItemCount() {
        return productList.size();
    }

    // Wewnętrzna klasa ViewHolder przechowuje referencje do widoków wiersza.
    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public TextView productText;
        public TextView priceText;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            productText = itemView.findViewById(R.id.productText);
            priceText = itemView.findViewById(R.id.priceText);
        }
    }
}