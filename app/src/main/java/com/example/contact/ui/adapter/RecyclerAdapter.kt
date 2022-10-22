package com.example.contact.ui.adapter

import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.contact.R
import com.example.contact.SelectedClickListener
import com.example.contact.data.database.entities.ContactEntity
import com.example.contact.data.model.ContactItem
import com.example.contact.databinding.RecyclerLayoutBinding


class RecyclerAdapter(val listener: SelectedClickListener) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var items: List<ContactItem> = emptyList()

    inner class ViewHolder(private val binding: RecyclerLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(position: Int): Unit = binding.run {
            if (items[position].selected)
                container.background = container.context.getColor(R.color.light_gray).toDrawable()
            else
                container.background = container.context.getColor(R.color.white).toDrawable()

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