package com.bignerdranch.android.criminalintent2

import android.app.Application
import android.content.pm.ApplicationInfo

class CriminalIntentApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}