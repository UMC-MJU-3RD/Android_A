package com.example.umcandriod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umcandriod.databinding.ActivityMainBinding
import com.example.umcandriod.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySecondBinding.inflate(layoutInflater)

        setContentView(viewBinding.root)

        // 넘어온 정보를 받는다
//        val intentExtras = intent.extras
//        val data = intentExtras!!["text"] as String // 형변환(as) !!(not null인 것이 확실할 때)
//
//        viewBinding.tvSecondText.text = data
    }
}