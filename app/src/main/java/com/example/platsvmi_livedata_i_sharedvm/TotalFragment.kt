package com.example.platsvmi_livedata_i_sharedvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.platsvmi_livedata_i_sharedvm.databinding.FragmentTotalBinding


class TotalFragment : Fragment() {

    private lateinit var binding: FragmentTotalBinding
    private val viewModel: PlatsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTotalBinding.inflate(inflater)


        viewModel.plats.observe(viewLifecycleOwner, Observer { menu ->
            binding.PrimerPlatFinal.text = "Preu Primer plat: ${menu.preu}"
        })



        return binding.root

    }

}