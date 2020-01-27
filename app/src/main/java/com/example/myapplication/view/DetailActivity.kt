package com.example.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.header_layout.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val textView:TextView = findViewById(R.id.tv_detail)
        val detailData=intent.getStringExtra("detail_data")
        textView.setText(detailData)
        back_image.setOnClickListener {
            finish()
        }
        textview_title.setText("NewsDetail")

    }
}
