package com.example.platsvmi_livedata_i_sharedvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlatsViewModel: ViewModel() {

    private val _plats = MutableLiveData<Menu>()
    val plats: LiveData<Menu> = _plats


    fun updateMenu(plat: Int, quant: Int, preu: Int) {
        _plats.value = Menu(plat, quant, preu)
    }

    fun pintarPreuPrincipalFinal (){

    }


}