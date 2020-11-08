package com.example.myapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapp.model.Hotel

class MainViewModel : ViewModel() {

    val userLiveData = MutableLiveData<ArrayList<Hotel>>()
    private val originalresturantList = ArrayList<Hotel>()
    private val resturantList = ArrayList<Hotel>()

    fun load(){
        originalresturantList.addAll(dataSet())
    }

    private fun dataSet(): ArrayList<Hotel> {
        val Resturant1 = Hotel("KalaiyaIn", "Kalaiya", "Nepali Food",4,"")
        val Resturant2 = Hotel("SonaBekar", "Birgunj", "MOMO",5,"")
        val Resturant3  = Hotel("HimachalCabin", "Narayanghat", "chinese",3,"")
        val Resturant4  = Hotel("Ichca", "Simra", "Gurjati thali",5,"")
        val Resturant5 = Hotel("SonaCafe", " Bariyapur", "Nepali Food",3,"")
        val Resturant6 = Hotel(" Hi-Way Inn", "Kathmandu", "MOMO",5,"")
        val Resturant7 = Hotel("Cute Mountains", "Pokhara", "Traditional",3,"")
        val Resturant8  = Hotel("The Breakers", "Biratnagar", "Italian",4,"")


        val resturantList = ArrayList<Hotel>()
        resturantList.add(Resturant1)
        resturantList.add(Resturant2)
        resturantList.add(Resturant3)
        resturantList.add(Resturant4)
        resturantList.add(Resturant5)
        resturantList.add(Resturant6)
        resturantList.add(Resturant7)
        resturantList.add(Resturant8)

        return resturantList
    }

    fun addButtonClicked() {
        if(originalresturantList.isNotEmpty()){
            resturantList.add(originalresturantList.removeFirst())
            userLiveData.value = resturantList
        }
    }
}
