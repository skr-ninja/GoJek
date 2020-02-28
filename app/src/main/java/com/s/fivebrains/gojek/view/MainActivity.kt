package com.s.fivebrains.gojek.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.s.fivebrains.gojek.R

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        // for expend recyclerview help
 // https://stackoverflow.com/questions/27203817/recyclerview-expand-collapse-items
    }

}
