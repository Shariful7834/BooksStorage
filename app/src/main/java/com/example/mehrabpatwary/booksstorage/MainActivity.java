package com.example.mehrabpatwary.booksstorage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BookAdapter adapter;
    private Book book;
    private List<Book>books=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleViewId);
        book = new Book();
        adapter = new BookAdapter(book.generateBookList());
        GridLayoutManager glm = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(glm);
        recyclerView.setAdapter(adapter);
    }
}
