package com.example.kotlin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView

class SecondPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // BIND
        val mTextview : AppCompatTextView = findViewById(R.id.text_view);
        val mBackButton : AppCompatImageView = findViewById(R.id.back_button)
        val mEventButton : AppCompatTextView = findViewById(R.id.event_button)

        // 변수 선언
        val string_value : String = "두번째 페이지";
        val arrayList:Array<String> = arrayOf("1", "2", "3", "4", "5")


        // SETTING
        mTextview.text = arrayList[0]

        // CLICK EVENT
        mBackButton.setOnClickListener {
            // 현재 액티비티 종료)
            finish()
        }

        mEventButton.setOnClickListener {
            var len : Int = 0
            len ++
            mTextview.text = arrayList[len]

        }
    }
}