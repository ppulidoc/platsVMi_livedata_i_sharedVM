package com.example.platsvmi_livedata_i_sharedvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlatsViewModel: ViewModel() {

    private val _plats = MutableLiveData<Menu>()
    val plats: LiveData<Menu> = _plats

    // Primer plato
    private val _quantPlat1 = MutableLiveData<Int>()
    val quantPlat: LiveData<Int> get() = _quantPlat1

    private val _preu1 = MutableLiveData<Int>()
    val preu: LiveData<Int> get() = _preu1

    private val _plato1= MutableLiveData<Int>()
    val plato1: LiveData<Int> get() = _plato1

    private val _platoResult1 = MutableLiveData<Int>()
    val platoResult1: LiveData<Int> get() = _platoResult1

    // Segon plat

    private val _quantPlat2 = MutableLiveData<Int>()
    val quantPlat2: LiveData<Int> get() = _quantPlat2

    private val _preu2 = MutableLiveData<Int>()
    val preu2: LiveData<Int> get() = _preu2

    private val _plato2= MutableLiveData<Int>()
    val plato2: LiveData<Int> get() = _plato2

    private val _platoResult2 = MutableLiveData<Int>()
    val platoResult2: LiveData<Int> get() = _platoResult2

    // Final

    private val _resultFinal = MutableLiveData<Int>()
    val resultFinal: LiveData<Int> get() = _resultFinal

    private val _resultFinalDesconte = MutableLiveData<Int>()
    val resultFinalDesconte: LiveData<Int> get() = _resultFinalDesconte


    fun updateMenu1(plat: Int, quant: Int, preu: Int) {
        _quantPlat1.value = quant
        _preu1.value = preu
        _plato1.value = plat
    }

    fun updateMenu2(plat: Int, quant: Int, preu: Int) {
        _quantPlat2.value = quant
        _preu2.value = preu
        _plato2.value = plat
    }

    fun pintarPreuPrincipalFinal () {
        val returnPreu = (_quantPlat1.value ?: 0) * (_preu1.value ?: 0)
        _platoResult1.value = returnPreu
    }

    fun pintarPreuSegonFinal () {
        val returnPreu2 = (_quantPlat2.value ?: 0) * (_preu2.value ?: 0)
        _platoResult2.value = returnPreu2
    }

    fun totalPreuFinal() {
        val returnFinal = (_platoResult1.value ?: 0) + (_platoResult2.value ?: 0)
        _resultFinal.value = returnFinal

    }

    fun totalPreuFinalDesconte() {

        val desconte = ((_resultFinal.value ?: 0) * 10 )/100
        _resultFinalDesconte.value = (_resultFinal.value ?: 0) - desconte

    }


}