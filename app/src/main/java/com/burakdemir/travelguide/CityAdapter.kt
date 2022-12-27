package com.burakdemir.travelguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.burakdemir.travelguide.databinding.RecyclerRowBinding

class CityAdapter(val cityList:ArrayList<City>): RecyclerView.Adapter<CityAdapter.CityViewHolder>() {
    class CityViewHolder(val binding: RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val binding =RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CityViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.binding.cityRecyclerViewTextView.text=cityList.get(position).city

        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,GuideActivity::class.java)
            //intent.putExtra("city",cityList.get(position))
            Singleton.chosenCity=cityList.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return cityList.size
    }
}