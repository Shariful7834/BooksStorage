package com.example.mehrabpatwary.booksstorage;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    private List<Book>bookList;

    public BookAdapter(List<Book> bookList) {
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.card_view_row,parent,false);
        return new BookViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
    holder.imageTv.setImageResource(bookList.get(position).getImage());
    holder.nameTv.setText(bookList.get(position).getBookName());
    holder.writterTv.setText(bookList.get(position).getBookWritter());
    holder.priceTv.setText(bookList.get(position).getBookPrice());

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageTv;
    private TextView nameTv;
    private TextView writterTv;
    private TextView priceTv;
        public BookViewHolder(final View itemView) {
            super(itemView);
            imageTv = itemView.findViewById(R.id.bookImageInput);
            nameTv = itemView.findViewById(R.id.bookNameInput);
            writterTv = itemView.findViewById(R.id.bookWritterInput);
            priceTv = itemView.findViewById(R.id.bookPriceInput);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Toast.makeText(itemView.getContext(), bookList.get(position).getBookName(), Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}
