 package com.example.platsvmi_livedata_i_sharedvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.platsvmi_livedata_i_sharedvm.databinding.FragmentPrimerPlatBinding


 class PrimerPlatFragment : Fragment() {

    private lateinit var binding: FragmentPrimerPlatBinding
    private val viewModel: PlatsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?



    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPrimerPlatBinding.inflate(inflater)



        binding.button.setOnClickListener(){

            val quantitat = binding.cantidadTextPlato1.text.toString()
            val preu = binding.textPreu.text.toString()

            val quantInt = quantitat.toIntOrNull()
            val preuInt = preu.toIntOrNull()

            if (quantInt != null && preuInt != null ) {
                viewModel.updateMenu1(1,quantInt,preuInt)
            }

            viewModel.pintarPreuPrincipalFinal()

            findNavController().navigate(R.id.action_primerPlatFragment_to_segonPlatFragment, null)
        }


        return binding.root

    }

}

