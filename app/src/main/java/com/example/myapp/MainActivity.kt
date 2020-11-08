package com.example.myapp

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.view.RecyclerViewAdapter
import com.example.myapp.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var context : Context
    private lateinit var viewModel : MainViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this

        // init
        recyclerView = findViewById(R.id.rv_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.userLiveData.observe(this){
            recyclerViewAdapter = RecyclerViewAdapter(it)
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = recyclerViewAdapter
        }
        viewModel.load()
    }
    fun onClicked(v: View){
        viewModel.addButtonClicked()
    }
}
