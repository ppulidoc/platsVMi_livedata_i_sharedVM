 package com.example.platsvmi_livedata_i_sharedvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.platsvmi_livedata_i_sharedvm.databinding.FragmentPrimerPlatBinding


 class PrimerPlatFragment : Fragment() {

    private lateinit var binding: FragmentPrimerPlatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPrimerPlatBinding.inflate(inflater)


        return binding.root

    }

}