package com.example.expandableview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.VersionViewHolder> {
    List<product> productList;

    public ProductAdapter(List<product> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public VersionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
       return new VersionViewHolder(view);
         }

    @Override
    public void onBindViewHolder(@NonNull VersionViewHolder holder, int position) {

        product product = productList.get(position);
        holder.codenametxt.setText(product.getProductname());
        holder.versionTxt.setText(product.getPrice());
        holder.apiTxt.setText(product.getQuantity());
        holder.descriptiontxt.setText(product.getDescription());

        boolean isExpandable = productList.get(position).isExpandable();
        holder.expandablelayout.setVisibility(isExpandable ? View.VISIBLE:View.GONE);





    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class VersionViewHolder extends RecyclerView.ViewHolder{

        TextView codenametxt , versionTxt , apiTxt , descriptiontxt;
        LinearLayout linearLayout;
        RelativeLayout expandablelayout;
        public VersionViewHolder(@NonNull View itemView) {

            super(itemView);
            codenametxt = itemView.findViewById(R.id.productname);
            versionTxt = itemView.findViewById(R.id.price);
            apiTxt = itemView.findViewById(R.id.description);
            descriptiontxt = itemView.findViewById(R.id.description);
            linearLayout = itemView.findViewById(R.id.linearlayout);
            expandablelayout = itemView.findViewById(R.id.expandablelayout);
             linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                product versions = productList.get(getAdapterPosition());
                versions.setExpandable(!versions.isExpandable());
                notifyItemChanged(getAdapterPosition());
            }
        });
        }
    }

}
