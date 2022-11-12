package com.example.simplelistview
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
@Suppress("UNREACHABLE_CODE")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val my_CustomAdapter =CustomAdapter (this, myItemList)
        myList.adapter = my_CustomAdapter

        //any item in list
        myList.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            when(position){
                0 -> { val i =Intent(this,MainActivity2::class.java)
                startActivity(i)}
                else ->{  val i =Intent(this,MainActivity2::class.java)
                    startActivity(i)}
            }
            Toast.makeText(applicationContext ,position.toString(),Toast.LENGTH_LONG).show()

            }
            }



    }
