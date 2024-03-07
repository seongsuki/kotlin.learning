package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // BIND
        val mTextview : AppCompatTextView = findViewById(R.id.text_view);
        val mNextButton : AppCompatTextView = findViewById(R.id.next_button);
        val string_value : String = "첫번째 페이지";

        // SETTING
        mTextview.text = string_value

        // CLICK EVENT
        mNextButton.setOnClickListener {
            var intent = Intent(this, SecondPageActivity::class.java)
            startActivity(intent)
        }
    }




}