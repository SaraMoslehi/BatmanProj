package com.example.bathmanproj

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bathmanproj.model.BathmanDetail
import com.example.bathmanproj.model.BathmanList
import java.util.zip.Inflater

class ListAdapter(var list: ArrayList<BathmanList>) :
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