package com.example.platsvmi_livedata_i_sharedvm

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.platsvmi_livedata_i_sharedvm.databinding.FragmentTotalBinding


class TotalFragment : Fragment() {

    private lateinit var binding: FragmentTotalBinding

    private val viewModel: PlatsViewModel by activityViewModels()
    //private val viewModel = ViewModelProvider(requireActivity())[PlatsViewModel::class.java]

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTotalBinding.inflate(inflater)


        viewModel.platoResult1.observe(viewLifecycleOwner) { preu ->
            binding.PrimerPlatFinal.text = "Preu Primer plat: $preu"
        }

        viewModel.platoResult2.observe(viewLifecycleOwner) { preuBeguda ->
            binding.SegonPlat.text = "Preu Beguda: $preuBeguda"
        }

        viewModel.resultFinal.observe(viewLifecycleOwner) { preuFinal ->
            binding.textTotal.text = "Preu Total: $preuFinal"
        }

        viewModel.resultFinalDesconte.observe(viewLifecycleOwner) { preuFinalDesc ->
            binding.textTotalDesconte.text = "Preu Total amb 10 %: $preuFinalDesc"
        }





        return binding.root

    }

}