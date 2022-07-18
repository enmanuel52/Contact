package com.example.contact.ui.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contact.ClicListenner
import com.example.contact.R
import com.example.contact.data.database.entities.ContactEntity
import com.example.contact.databinding.RecyclerLayoutBinding
import com.squareup.picasso.Picasso


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
        with(holder.binding){
            //cambiar es el de la letra
            tvName.text = items[position].name
            items[position].urlPicture.let { url ->
                if(url != null)
                    Uri.parse(url).also { avatar.setImageURI(it) }
                else
                    avatar.setImageResource(R.drawable.person_96px)
            }
        }

    }

    override fun getItemCount() = items.count()
}