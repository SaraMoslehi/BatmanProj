package com.example.batmanproj.fragment.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.batmanproj.R
import com.example.batmanproj.databinding.RowItemBinding
import com.example.batmanproj.db.BatmanListEntitiy
import com.example.batmanproj.model.Search

class ListAdapter
    (var list: MutableList<Search>, context: Context,
     onClickAdapter: OnClickAdapter) :
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    var mItems: MutableList<Search> = list
    var mContext: Context = context
    var onClickAdapter = onClickAdapter


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<RowItemBinding>(
            layoutInflater,
            R.layout.row_item,
            parent,
            false

        )
        return ViewHolder(binding.root)
    }

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//
//        val layoutInflater = LayoutInflater.from(parent.context)
//        val binding = DataBindingUtil.inflate<RowItemBinding>(
//            layoutInflater, R.layout.row_item,
//            parent,
//            false
//
//        )
//        return  RecyclerView.ViewHolder(binding.root)
//    }
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
//        ListAdapterHolder(
//            LayoutInflater.from(parent.context).inflate(
//                R.layout.row_item,
//                parent,
//                false
//            )
//        )

    override fun getItemCount() = mItems.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mItems[position]

        holder.binding!!.txtTitle.text = item.title
        Glide.with(mContext)
            .load(item.poster)
            .into(holder.binding!!.imgPoster)
        holder.binding!!.executePendingBindings()


    }

    fun updateList(newList: ArrayList<Search>?) {
        if (newList != null) {
            mItems.addAll(newList)
            notifyDataSetChanged()
        }
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var binding = DataBindingUtil.bind<RowItemBinding>(itemView)


        init {
            itemView.setOnClickListener(View.OnClickListener {
                onClickAdapter.onClick(adapterPosition, mItems[adapterPosition])
            })
        }

    }

    interface OnClickAdapter {
        fun onClick(position: Int, item: Search)
    }

}