package com.burakdemir.travelguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.burakdemir.travelguide.databinding.ActivityGuideBinding

class GuideActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGuideBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuideBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //val intent=intent
        //val selectedCity=intent.getSerializableExtra("city") as City

        val selectedCity=Singleton.chosenCity

        selectedCity?.let {
            binding.cityText.text=it.city
            binding.cityImage.setImageResource(it.imageView)
            binding.countryText.text=it.country
        }


    }


}