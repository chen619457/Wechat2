package com.example.wechat2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class FruitAdapter(context: Context, private val resource: Int, data: MutableList<Fruit>) :
    ArrayAdapter<Fruit>(context, resource, data) {

    private val resourceId = resource

    inner class ViewHolder(val fruitImage:ImageView,val fruitName:TextView,val fruitXs:TextView,val fruitTime: TextView)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val viewHolder:ViewHolder
        val view:View
        if (convertView == null){
            view=LayoutInflater.from(context).inflate(resourceId,parent,false)
            val fruitImage:ImageView = view.findViewById(R.id.fruitImage)
            val fruitName:TextView = view.findViewById(R.id.fruitName)
           // val textView2:TextView = view.findViewById(R.id.textView2)
            val fruitXs:TextView = view.findViewById(R.id.fruitXs)
            val fruitTime:TextView = view.findViewById(R.id.fruitTime)
            viewHolder = ViewHolder(fruitImage,fruitName,fruitXs,fruitTime)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val fruit = getItem(position)
        if (fruit !=null){
            viewHolder.fruitImage.setImageResource(fruit.imageId)
            viewHolder.fruitName.text = fruit.name
            viewHolder.fruitXs.text = fruit.csk
            viewHolder.fruitTime.text = getTime()

        }
        return view
    }
    fun getTime():String
    {
        val  data = Date()
        val  dateFormat = SimpleDateFormat("HH:mm:ss", Locale.CHINA)

        return dateFormat.format(data)
    }
}





//////书中练习
//class FruitAdapter(val  fruitList: List<Fruit>) :
//        RecyclerView.Adapter<FruitAdapter.ViewHolder>(){
//   inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
//       val fruitImage : ImageView = view.findViewById(R.id.fruitImage)
//       val fruitName : TextView = view.findViewById(R.id.fruitName)
//   }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context)
//            .inflate(R.layout.fruit_item,parent,false)
//        return  ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val fruit = fruitList[position]
//        holder.fruitImage.setImageResource(fruit.imageId)
//        holder.fruitName.text = fruit.name
//    }
//
//    override fun getItemCount() = fruitList.size
//
//
//}