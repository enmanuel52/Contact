package com.example.contact.ui.adapter

import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.contact.R
import com.example.contact.SelectedClickListener
import com.example.contact.databinding.RecyclerLayoutBinding
import com.example.contact.domain.model.Contact


class RecyclerAdapter(val listener: SelectedClickListener<Int>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var items: List<Contact> = emptyList()
    var selectedIds = emptyList<Int>()

    inner class ViewHolder(private val binding: RecyclerLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(position: Int): Unit = binding.run {
            avatarCheck.isVisible = selectedIds.contains(items[position].id)
            avatar.isVisible = !avatarCheck.isVisible

            //cambiar es el de la letra
            tvName.text = items[position].name
            items[position].image.let { url ->
                if (url != null)
                    Uri.parse(url).also { avatar.setImageURI(it) }
                else
                    avatar.setImageResource(R.drawable.person_96px)
            }

            binding.root.setOnClickListener {
                listener.onClick(items[adapterPosition].id)
            }

            binding.root.setOnLongClickListener {
                listener.onLongClick(items[adapterPosition].id)
                true
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            RecyclerLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.onBind(position)

    override fun getItemCount() = items.count()
}