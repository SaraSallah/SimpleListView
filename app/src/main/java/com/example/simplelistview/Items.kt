package com.example.simplelistview

data class Items (var name:String , var des:String , var image:Int)
var item_list =ArrayList<Items>()

val f1 = Items("Camera" ,"" ,R.drawable.camera)

val f2=Items("Printer","7 dollar",R.drawable.printer)

 val  f3= Items("speaker","7 dollar",R.drawable.sspeaker)

val f4=Items("mouse","7 dollar",R.drawable.mouse)
val myItemList = arrayListOf<Items>(f1,f2,f3,f4,f1,f2,f3,f4,f1,f2,f3,f4)

