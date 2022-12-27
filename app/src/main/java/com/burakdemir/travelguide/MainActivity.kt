package com.burakdemir.travelguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.burakdemir.travelguide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var cityList:ArrayList<City>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        cityList = ArrayList<City>()

        val rome=City("Rome","Italy",R.drawable.rome)
        val barcelona=City("Barcelona","Spain",R.drawable.barcelona)
        val istanbul=City("Istanbul","Turkey",R.drawable.istanbul)
        val monaco=City("Monaco","Monaco",R.drawable.monaco)

        cityList.add(rome)
        cityList.add(barcelona)
        cityList.add(istanbul)
        cityList.add(monaco)
        cityList.add(rome)
        cityList.add(barcelona)
        cityList.add(istanbul)
        cityList.add(monaco)
        cityList.add(rome)
        cityList.add(barcelona)
        cityList.add(istanbul)
        cityList.add(monaco)
        cityList.add(rome)
        cityList.add(barcelona)
        cityList.add(istanbul)
        cityList.add(monaco)

        binding.cityRecyclerView.layoutManager= LinearLayoutManager(this)
        val cityAdapter= CityAdapter(cityList)
        binding.cityRecyclerView.adapter=cityAdapter


    }





}