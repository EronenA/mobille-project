package org.eronen.project;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    TextView itemName;
    TextView itemAmount;
    ImageView imgDelete;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        itemName = itemView.findViewById(R.id.itemTextView);
        itemAmount = itemView.findViewById(R.id.amountTextView);
        imgDelete = itemView.findViewById(R.id.imgDelete);

    }
}
