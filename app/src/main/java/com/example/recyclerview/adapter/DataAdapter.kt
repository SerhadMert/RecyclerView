package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.data.model.Data

class DataAdapter(val list:List<Data>):RecyclerView.Adapter<DataAdapter.ViewHolder>() {


    class ViewHolder(item: View):RecyclerView.ViewHolder(item) {
        val name: TextView=item.findViewById(R.id.txt_name)
        val surname: TextView=item.findViewById(R.id.txt_surname)

        fun bind(result: Data){
            name.text=result.name
            surname.text=result.surname
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewItem= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_data_list,parent,false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount()= list.size
}