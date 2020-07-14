package com.codesample.bookwishlist.data;

import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ItemBook> {
    class ItemBook extends RecyclerView.ViewHolder{

        public ItemBook(@NonNull View itemView) {
            super(itemView);
        }
    }
    @NonNull
    @Override
    public ItemBook onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemBook holder, int position) {

    }


    private List<Book> data;
    private OnListItemClickListener listener;

    public interface OnListItemClickListener {
        public void onListItemClick(Book book);
        public void onListItemLongClick(Book book);
    }

    public void Book(List<Book> data) {
        this.data = data;
    }

    public void insert(Book book) {
        this.data.add(book);
    }
}
