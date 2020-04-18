package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytest.Kotlin.Ex_Interface
import kotlinx.android.synthetic.main.activity_main.*
import com.example.mytest.RxJava.Rx_Zip
import com.example.mytest.RxJava.Rx_Zip_Ex3

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            btn.text = "//"
        }


        Ex_Interface().NullInfo()
    }
}
