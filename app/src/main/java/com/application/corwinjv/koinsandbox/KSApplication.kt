package com.application.corwinjv.koinsandbox

import android.app.Application
import com.application.corwinjv.koinsandbox.koin.appModule
import org.koin.standalone.StandAloneContext.startKoin

class KSApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(listOf(appModule))
    }
}