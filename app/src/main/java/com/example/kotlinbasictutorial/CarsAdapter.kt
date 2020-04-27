package com.example.kotlinbasictutorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recycler_view_listitem.view.*

class CarsAdapter(val itemList: ArrayList<Car>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_listitem, parent, false))
    }
    override fun getItemCount(): Int {
        return itemList.size
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var myViewHolder = holder as MyViewHolder
        myViewHolder.bindData(itemList[position])
    }
    inner class MyViewHolder (view: View) : RecyclerView.ViewHolder(view){
        fun bindData(itemModel: Car) {
            Picasso.get().load(itemModel.imageResource).into(itemView.image_view_car)
            //itemView.text_view_title.text = itemModel.title
            itemView.text_view_description.text=itemModel.description
            itemView.image_view_car.setImageResource(itemModel.imageResource)
        }
    }
}


