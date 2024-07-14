package com.example.activitychecklistapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class rcAdapter: RecyclerView.Adapter<rcAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.each_item, parent, false)
        return ViewHolder(listItem)
    }

    override fun getItemCount(): Int {
        return 40
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvActivity.text = "the daily activities the daily activities the daily activities"
    }

    inner class ViewHolder(val view:View):RecyclerView.ViewHolder(view){
        val tvActivity = view.findViewById<TextView>(R.id.tvActivity)
        val ibInfo = view.findViewById<ImageButton>(R.id.ibInfo)
        val cbDone = view.findViewById<CheckBox>(R.id.cbDone)
    }
}