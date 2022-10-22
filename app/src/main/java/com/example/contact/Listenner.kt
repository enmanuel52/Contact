package com.example.contact

interface ClickListener<I> {

    fun onClick(id: I)

    fun onLongClick(id: I)
}

interface SelectedClickListener<I> : ClickListener<I> {
    /**
     * A list of selected elements ids*/
    fun getIds(): List<I>
}

enum class Action { Clear, Delete }