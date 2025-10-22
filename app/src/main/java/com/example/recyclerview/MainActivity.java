package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView usersRecyclerView;

    private RecyclerView usersRecyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Znajdź RecyclerView w layoucie
        usersRecyclerView = findViewById(R.id.usersRecyclerView);

        usersRecyclerView2 = findViewById(R.id.usersRecyclerView2);

        // 2. Przygotuj źródło danych
        List<User> users = new ArrayList<>();
        users.add(new User("Polska"));
        users.add(new User("Rosja"));
        users.add(new User("Wielka Brytania"));
        users.add(new User("Niemcy"));
        users.add(new User("Hiszpania"));
        users.add(new User("Włochy"));
        users.add(new User("Bułgaria"));
        users.add(new User("Norwegia"));
        users.add(new User("Finlandia"));
        users.add(new User("Szwecja"));


        List<Product> product = new ArrayList<>();
        product.add(new Product("Machewka", 2.60F));
        product.add(new Product("Japko", 4.60F));
        product.add(new Product("Pistolet", 50.99F));
        product.add(new Product("Czołg", 2000F));
        product.add(new Product("Śpiulkolot", 150.25F));
        product.add(new Product("Makowiec", 6.69F));
        product.add(new Product("Drzewo", 38.99F));
        product.add(new Product("Rakieta", 780F));
        product.add(new Product("Antymateria", 2057.99F));
        product.add(new Product("Gwiazda", 69023F));
        // ... dodaj więcej użytkowników

        // 3. Stwórz Adapter i przekaż mu dane
        UserAdapter adapter1 = new UserAdapter(users);
        ProductAdapter adapter2 = new ProductAdapter(product);

        // 4. Ustaw Adapter i LayoutManager dla RecyclerView
        usersRecyclerView.setAdapter(adapter1);
        usersRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        usersRecyclerView2.setAdapter(adapter2);
        usersRecyclerView2.setLayoutManager(new LinearLayoutManager(this));

    }
}