package com.example.batmanproj.fragment.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.batmanproj.R
import com.example.batmanproj.model.BatmanList

class ListAdapter(var list: ArrayList<BatmanList>) :
    RecyclerView.Adapter<ListAdapter.ListAdapterHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ListAdapterHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.row_item,
                parent,
                false
            )
        )

    override fun getItemCount() = list.size


    override fun onBindViewHolder(holder: ListAdapterHolder, position: Int) {

    }

    fun updateList(newList: List<BatmanList>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    class ListAdapterHolder(view: View) : RecyclerView.ViewHolder(view) {
        //        val binding :RowItemBinding
//        init {
//            binding =
//        }

        fun bind() {

        }

    }

}