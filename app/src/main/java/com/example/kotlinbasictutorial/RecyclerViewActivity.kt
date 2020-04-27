package com.example.kotlinbasictutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recyclerview.*

class RecyclerViewActivity:AppCompatActivity() {


    var listcars: ArrayList<Car> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        listcars.add(Car("Mclaren","MC Description",R.drawable.mclaren))
        listcars.add(Car("Honda","Honda Description",R.drawable.honda_nsx))
        listcars.add(Car("Jaguar","Jaguar Description",R.drawable.jaguar_f))
        listcars.add(Car("Mercedes","Mercedes Description",R.drawable.mercedes_amg))
        listcars.add(Car("Audi","Audi Description",R.drawable.audi_r))
        listcars.add(Car("Aston Martin","AM Description",R.drawable.astonmartin))
        listcars.add(Car("Aston Martin 2","AM2 Description",R.drawable.aston_martin))
        listcars.add(Car("Maseratti","Maserati Description",R.drawable.maserati_granturismo))
        listcars.add(Car("Nisan","Nisan Description",R.drawable.nissan))

        for (i  in 0..100){
            listcars.add(Car("Nisan","Nisan Description +$i",R.drawable.nissan))
        }
        


        var carsAdapter:CarsAdapter= CarsAdapter((listcars))

        recycler_view_activities.adapter=carsAdapter
    }
}