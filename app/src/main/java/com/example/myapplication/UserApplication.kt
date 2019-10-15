package com.example.myapplication

import android.util.Log
import androidx.multidex.MultiDexApplication

class UserApplication : MultiDexApplication() {
    private val TAG = "UserApplication"

    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }
    companion object {
        private var appInstance: UserApplication? = null

        fun getInstance(): UserApplication {
            if (appInstance == null){
                throw IllegalAccessException("Configure a classe de Application no user AndroidManifest.xml ")
            }
            return appInstance!!
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d(TAG, "UserApplication.onTerminate()")
    }
}