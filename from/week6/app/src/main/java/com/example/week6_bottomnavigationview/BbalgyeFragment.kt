package com.example.week6_bottomnavigationview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.week6_bottomnavigationview.databinding.FragmentBbalgyeBinding
import com.example.week6_bottomnavigationview.databinding.FragmentRamenBinding

class BbalgyeFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentBbalgyeBinding.inflate(layoutInflater).root
    }
}