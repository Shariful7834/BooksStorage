package com.example.mehrabpatwary.booksstorage;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHoler>{

    @NonNull
    @Override
    public BookViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHoler holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BookViewHoler extends RecyclerView.ViewHolder {

        public BookViewHoler(View itemView) {
            super(itemView);
        }
    }
}
