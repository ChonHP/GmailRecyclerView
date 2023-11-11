package com.example.gmailrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomMailAdapter (private val mList : List<MailItem>) : RecyclerView.Adapter<CustomMailAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtSender: TextView = itemView.findViewById(R.id.txtSender)
        val txtSubject: TextView = itemView.findViewById(R.id.txtSubject)
        val txtContent: TextView = itemView.findViewById(R.id.txtContent)
        val txtTimeSend: TextView = itemView.findViewById(R.id.txtTimeSend)
        val imgBase : TextView = itemView.findViewById(R.id.imageBase)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.mail_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemViewHolder = mList[position]
        holder.txtSender.text = itemViewHolder.sender
        holder.txtSubject.text = itemViewHolder.subject
        holder.txtContent.text = itemViewHolder.content
        holder.txtTimeSend.text = itemViewHolder.time
        holder.imgBase.text = itemViewHolder.sender[0].toString()
        holder.imgBase.setBackgroundColor(itemViewHolder.color)
    }
}