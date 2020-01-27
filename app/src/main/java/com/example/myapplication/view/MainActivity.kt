package com.example.myapplication.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.CustomAdapter
import com.example.myapplication.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.header_layout.*
import kotlinx.android.synthetic.main.layout_progress.*

class MainActivity : AppCompatActivity() {

    var mainviewmodel: MainViewModel? = null
    var isloading: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progressBar.visibility = View.VISIBLE
        isloading = true
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        back_image.setOnClickListener {
            finish()
        }
        textview_title.setText("NewsHeadline")

        mainviewmodel = ViewModelProviders.of(this).get(MainViewModel::class.java)


        mainviewmodel!!.getDetail()?.observe(this, Observer {
            it
            progressBar.visibility = View.INVISIBLE

            val adapter =
                CustomAdapter(this, it, object : CustomAdapter.ItemClickListener {
                    override fun clickRow(detailData: String?) {
                        openDetailActivity(detailData)
                    }
                })
            recyclerView.adapter = adapter
        })
    }

    fun openDetailActivity(detailData: String?) {
        val i = Intent(this, DetailActivity::class.java)
        i.putExtra("detail_data", detailData)
        startActivity(i)
    }

    override fun onBackPressed() {
        if (isloading) {

        } else {
            super.onBackPressed();

        }
    }
}
