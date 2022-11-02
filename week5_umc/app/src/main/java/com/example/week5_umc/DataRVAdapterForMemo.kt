package com.example.week5_umc

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.week5_umc.databinding.ItemDataBinding
import com.example.week5_umc.databinding.ItemDataMemoBinding

// recycler view Adapter
// item 이 들어갈 목록을 파라미터로 넣는다. -> constructor
// 따로 함수를 만들어주는 복잡성을 줄이기 위해서
class DataRVAdapterForMemo (private val dataList:ArrayList<Data>): RecyclerView.Adapter<DataRVAdapterForMemo.DataViewHolder>(){

    // viewHolder 객체
    // viewHolder가 ItemData.xml에 있는 constraintLayout을 가져옴.
    inner class DataViewHolder(private val viewBinding: ItemDataMemoBinding): RecyclerView.ViewHolder(viewBinding.root){
        val view = viewBinding
        // viewHolder가 실행될 때 호출시켜 줄 함수
        fun bind(data: Data){
            viewBinding.tvTitle.text = data.title
            viewBinding.tvDesc.text = data.desc
        }

    }


    // ViewHolder 만들어질 때 실행할 동작
    // xml 파일을 실제로 ViewHolder 에 넣어준다.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val viewBinding = ItemDataMemoBinding.inflate(LayoutInflater.from(parent.context), parent, false) // layout을 해석하는 Inflater
        // attachToParent : 미리 부모에 붙일 것인지 아닌지 -> 대부분 false로 두기
        return DataViewHolder(viewBinding)
    }

    // ViewHolder 가 실제로 데이터를 가져와서 표시해야할 때 호출되는 함수
    // 스크롤을 해서 위치가 변경된 경우
    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(dataList[position])
        holder.view.delBtn.setOnClickListener{
            dataList.removeAt(position)
            notifyDataSetChanged()
        }
    }

    // 표현할 Item의 총 개수
    override fun getItemCount(): Int = dataList.size

    
}