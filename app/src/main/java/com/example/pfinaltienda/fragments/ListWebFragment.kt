package com.example.pfinaltienda.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pfinaltienda.R
import com.example.pfinaltienda.databinding.FragmentListWebBinding


class ListWebFragment : Fragment() {

    private lateinit var binding: FragmentListWebBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListWebBinding.inflate(inflater, container, false)
        return binding.root
    }

}