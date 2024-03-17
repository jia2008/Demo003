package com.example.demo003;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHold>{
    @NonNull
    @Override
    public ViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = from(parent)
        return null;
    }

    private View from(ViewGroup parent) {
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHold holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ViewHold extends RecyclerView.ViewHolder{

        public ViewHold(@NonNull View itemView) {
            super(itemView);
        }
    }
}
