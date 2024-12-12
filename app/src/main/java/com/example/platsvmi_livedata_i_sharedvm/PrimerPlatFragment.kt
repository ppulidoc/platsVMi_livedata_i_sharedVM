 package com.example.platsvmi_livedata_i_sharedvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.platsvmi_livedata_i_sharedvm.databinding.FragmentPrimerPlatBinding


 class PrimerPlatFragment : Fragment() {

    private lateinit var binding: FragmentPrimerPlatBinding
    private val viewModel: PlatsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPrimerPlatBinding.inflate(inflater)


        return binding.root

    }

}

