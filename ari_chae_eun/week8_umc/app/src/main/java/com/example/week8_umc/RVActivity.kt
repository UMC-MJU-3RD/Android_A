package com.example.week8_umc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week8_umc.databinding.ActivityRvactivityBinding

class RVActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityRvactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityRvactivityBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val dataList: ArrayList<DataforRV> = arrayListOf()

        dataList.apply {
            add(DataforRV("hello", "1"))
            add(DataforRV("hello", "2"))
            add(DataforRV("hello", "3"))
            add(DataforRV("hello", "4"))
            add(DataforRV("hello", "5"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
            add(DataforRV("hello", "6"))
        }

        val dataRVAdapter = DataRVAdapter(dataList)

        viewBinding.rvData.adapter = dataRVAdapter // adapter
        viewBinding.rvData.layoutManager = LinearLayoutManager(this)// layoutManager
        // context: 어플리케이션 정보가 들어가있음.

        // 데이터를 추가했을 때 recycler view 에 알려주어야 함.

        Handler(mainLooper).postDelayed({
            dataList.apply {
                add(DataforRV("hello", "7"))
                add(DataforRV("hello", "8"))
                add(DataforRV("hello", "9"))
                add(DataforRV("hello", "10"))
            }
//            dataRVAdapter.notifyDataSetChanged() // 데이터 셋이 추가 되었음.
            // dataSetChanged()를 사용하지 않는 이유는 기존에 있는 recycler view 의 정보들을 모두 다 가져와야 한다. 완전히 새로고침할 때 사용한다.
            dataRVAdapter.notifyItemRangeInserted(11, 1)

        }, 1000)
    }
}