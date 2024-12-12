package com.example.platsvmi_livedata_i_sharedvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.platsvmi_livedata_i_sharedvm.databinding.FragmentSegonPlatBinding


class SegonPlatFragment : Fragment() {

    private lateinit var binding: FragmentSegonPlatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSegonPlatBinding.inflate(inflater)

        binding.button.setOnClickListener(){
            findNavController().navigate(R.id.action_segonPlatFragment_to_totalFragment, null)
        }


        return binding.root

    }

}