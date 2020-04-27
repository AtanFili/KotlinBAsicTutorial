package com.example.kotlinbasictutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_view_listitem.view.*

class MainActivity : AppCompatActivity() {
   var listActivities: ArrayList<String> = arrayListOf("RelativeLayoutActitity","calculatorActivity","ToDoList","Calc3Activity","RecyclerViewActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Picasso.get().load("https://images.reverb.com/image/upload/s--gBiiDruo--/f_auto,t_large/v1547723824/wel6csurueomytvmybx5.jpg").fit().into(image_view_background)

        var activitiesAdaptder = ArrayAdapter(this,android.R.layout.simple_list_item_1,listActivities)

        list_view_activities.adapter=activitiesAdaptder

        list_view_activities.setOnItemClickListener { adapterView, view, i, id ->
            var className:String=listActivities[i]
           when(className){
               "RelativeLayoutActitity"->{startActivity(Intent(applicationContext,RelativeLayoutActivity::class.java))}
               "calculatorActivity"->{startActivity(Intent(applicationContext,CalculatorActivity::class.java))}
               "ToDoList"->startActivity(Intent(applicationContext,TodoListActivity::class.java))
               "Calc3Activity"->startActivity(Intent(applicationContext,Calc3Activity::class.java))
               "RecyclerViewActivity"->startActivity(Intent(applicationContext,RecyclerViewActivity::class.java))

           }

            Toast.makeText(applicationContext,className,Toast.LENGTH_SHORT).show()
        }

    }
}
