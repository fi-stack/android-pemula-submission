package com.dicoding.picodiploma.submissionandroidpemula.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.submissionandroidpemula.R
import com.dicoding.picodiploma.submissionandroidpemula.model.Character

class ListCharacterAdapter(private val listCharacter: ArrayList<Character>) :
    RecyclerView.Adapter<ListCharacterAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row_character, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCharacter.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val character = listCharacter[position]
        Glide.with(holder.itemView.context)
            .load(character.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = character.name
        holder.tvDetail.text = character.detail
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listCharacter[holder.adapterPosition]) }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Character)
    }
}