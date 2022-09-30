package com.bignerdranch.android.criminalintent2

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {


    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()
}