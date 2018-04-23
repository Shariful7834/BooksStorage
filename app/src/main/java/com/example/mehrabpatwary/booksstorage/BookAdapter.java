package com.example.mehrabpatwary.booksstorage;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHoler>{
    private List<Book>bookList;

    public BookAdapter(List<Book> bookList) {
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.card_view_row,parent,false);
        return new BookViewHoler(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHoler holder, int position) {
    holder.imageTv.setImageResource(bookList.get(position).getImage());
    holder.nameTv.setText(bookList.get(position).getBookName());
    holder.writterTv.setText(bookList.get(position).getBookWritter());
    holder.priceTv.setText(bookList.get(position).getBookPrice());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class BookViewHoler extends RecyclerView.ViewHolder {
    private ImageView imageTv;
    private TextView nameTv;
    private TextView writterTv;
    private TextView priceTv;
        public BookViewHoler(View itemView) {
            super(itemView);
            itemView.findViewById(R.id.bookImageInput);
            itemView.findViewById(R.id.bookNameInput);
            itemView.findViewById(R.id.bookWritterInput);
            itemView.findViewById(R.id.bookPriceInput);
        }
    }
}
