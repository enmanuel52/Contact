package com.example.contact.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contact.ClicListenner
import com.example.contact.R
import com.example.contact.data.database.entities.ContactEntity
import com.example.contact.databinding.RecyclerLayoutBinding


class RecyclerAdapter(private val clic: ClicListenner) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var items: List<ContactEntity> = emptyList()

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //binding
        val binding = RecyclerLayoutBinding.bind(view)

        //clic listener, change later
        init {
            binding.root.setOnClickListener {
                clic.clic(items[adapterPosition].id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //cambiar es el de la letra
        holder.binding.tvLetter.text = items[position].name[0].toString().uppercase()
        holder.binding.tvName.text = items[position].name
    }

    override fun getItemCount() = items.count()
}