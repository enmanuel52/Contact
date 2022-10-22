package com.example.contact

interface ClickListener {

    fun onClick(id: Int)

    fun onLongClick(id: Int)
}

interface SelectedClickListener : ClickListener {

    /**
     * @param [action] what to do
     * Do some action with the elements selected by their ids*/
    fun onSelectedClick(action: Action)

    /**
     * @return a [List] of [Int]
     * a list of elements ids*/
    fun getIds(): List<Int>
}

enum class Action { Select, Clear, Delete }