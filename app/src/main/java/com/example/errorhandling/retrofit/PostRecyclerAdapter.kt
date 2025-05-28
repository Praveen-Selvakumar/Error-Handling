package com.example.errorhandling.retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.errorhandling.databinding.PostItemBinding

class PostRecyclerAdapter : RecyclerView.Adapter<PostRecyclerAdapter.ViewHolder>() {


    private var overAllList = arrayListOf<PostDataItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            PostItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
         return  overAllList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    public fun swapDataItems(list: List<PostDataItem>?) {
        if (!list.isNullOrEmpty()) {
            overAllList.clear()
            overAllList.addAll(list)
            notifyDataSetChanged()
        }
    }

   inner class ViewHolder(binding: PostItemBinding) : RecyclerView.ViewHolder(binding.root) {

       fun swapData(response : PostDataItem){

       }

    }
}