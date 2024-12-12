package com.example.platsvmi_livedata_i_sharedvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlatsViewModel: ViewModel() {

    private val _plats = MutableLiveData<Menus>()
    val plats: LiveData<Menus> = _plats





}