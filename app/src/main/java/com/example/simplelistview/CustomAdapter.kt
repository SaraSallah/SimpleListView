package com.example.simplelistview
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.list_row.view.*

class CustomAdapter (context: Context ,item :ArrayList<Items>,)
    :ArrayAdapter<Items>(context,0, item){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val list_view_item= LayoutInflater.from(context).inflate(R.layout.list_row,parent,false)

        val item= getItem(position)
        list_view_item.title.text = item!!.name
        list_view_item.descr.text =item.des
        list_view_item.imageView.setImageResource(item.image)
        return list_view_item


    }
    }

