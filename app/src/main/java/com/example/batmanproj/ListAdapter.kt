package com.example.batmanproj

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.batmanproj.model.BatmanList

class ListAdapter(var list: ArrayList<BatmanList>) :
    RecyclerView.Adapter<ListAdapter.ListAdapterHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ListAdapterHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
    )

    override fun getItemCount() = list.size


    override fun onBindViewHolder(holder: ListAdapterHolder, position: Int) {
        holder.bind()
    }


    class ListAdapterHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind() {

        }

    }

}