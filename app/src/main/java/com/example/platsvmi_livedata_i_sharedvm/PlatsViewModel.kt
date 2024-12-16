package com.example.platsvmi_livedata_i_sharedvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlatsViewModel: ViewModel() {

    private val _plats = MutableLiveData<Menu>()
    val plats: LiveData<Menu> = _plats

    private val _quantPlat1 = MutableLiveData<Int>()
    val quantPlat: LiveData<Int> get() = _quantPlat1

    private val _preu1 = MutableLiveData<Int>()
    val preu: LiveData<Int> get() = _preu1

    private val _plato1= MutableLiveData<Int>()
    val plato1: LiveData<Int> get() = _plato1

    private val _platoResult1 = MutableLiveData<Int>()
    val platoResult1: LiveData<Int> get() = _platoResult1


    fun updateMenu(plat: Int, quant: Int, preu: Int) {
        _quantPlat1.value = quant
        _preu1.value = preu
        _plato1.value = plat

    }

    fun pintarPreuPrincipalFinal () {
        val returnPreu = (_quantPlat1.value ?: 0) * (_preu1.value ?: 0)
        _platoResult1.value = returnPreu
    }


}