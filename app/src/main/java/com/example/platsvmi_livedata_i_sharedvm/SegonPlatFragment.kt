package com.example.platsvmi_livedata_i_sharedvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.platsvmi_livedata_i_sharedvm.databinding.FragmentSegonPlatBinding


class SegonPlatFragment : Fragment() {

    private lateinit var binding: FragmentSegonPlatBinding
    private val viewModel: PlatsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSegonPlatBinding.inflate(inflater)

        binding.button.setOnClickListener(){

            val quantitat = binding.cantidadTextPlato2.text.toString()
            val preu = binding.textPreu2nPlat.text.toString()

            val quantInt = quantitat.toIntOrNull()
            val preuInt = preu.toIntOrNull()

            if (quantInt != null && preuInt != null ) {
                viewModel.updateMenu2(2,quantInt,preuInt)
            }

            viewModel.pintarPreuSegonFinal()
            viewModel.totalPreuFinal()

            findNavController().navigate(R.id.action_segonPlatFragment_to_totalFragment, null)
        }


        return binding.root

    }

}