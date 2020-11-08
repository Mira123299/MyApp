package com.example.myapp.view

import android.location.Address
import android.media.Rating
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.R
import com.example.myapp.model.Hotel


class RecyclerViewAdapter(private val dataSet : List<Hotel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val icIV = itemView.findViewById<ImageView>(R.id.imgView_icon)
        val Name = itemView.findViewById<TextView>(R.id.txtView_name)
        val Address = itemView.findViewById<TextView>(R.id.txtView_address)
        val Speciality = itemView.findViewById<TextView>(R.id.txtView_speciality)
        val Rating = itemView.findViewById<TextView>(R.id.txtView_rating)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).
        inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = dataSet[position]
        val viewHolder = holder as ViewHolder
        viewHolder.Name.text = user.name
        viewHolder.Address.text = user.address
        viewHolder.Speciality.text = user.speciality
        viewHolder.Rating.text = user.rating.toString()
    }

    override fun getItemCount() = dataSet.size
}