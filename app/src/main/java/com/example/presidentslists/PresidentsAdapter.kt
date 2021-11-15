package com.example.presidentslists

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class TextItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val textView: TextView = view.findViewById(R.id.itemTextView)

}

class PresidentsAdapter(val data: Array<String>) : RecyclerView.Adapter<TextItemViewHolder>() {

    override fun getItemCount() = data.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.item_layout, parent, false)
        return TextItemViewHolder(view)

    }

    override fun onBindViewHolder(holder: TextItemViewHolder, position: Int) {
        holder.textView.text = data[position]
    }

}

