package com.example.viewbindingexample.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbindingexample.databinding.ItemRowBinding

//class Items_RVAdapter(private var itemsCells: ArrayList<String?>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//
//    override fun getItemCount(): Int {
//        return itemsCells.size
//    }
//
//    class ItemViewHolder(var viewBinding: ItemRowBinding) : RecyclerView.ViewHolder(viewBinding.root)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return ItemViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        val itemViewHolder = holder as ItemViewHolder
//        itemViewHolder.viewBinding.itemtextview.text = itemsCells[position]
//    }
//}


class Items_RVAdapter(
    private var itemsCells: ArrayList<String?>
) : RecyclerView.Adapter<Items_RVAdapter.ItemViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val itemViewHolder = holder as ItemViewHolder
        itemViewHolder.binding.itemtextview.text = itemsCells[position]
    }

    override fun getItemCount(): Int {
        return itemsCells.size
    }

    class ItemViewHolder(var binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)
}