package com.mbinfo.huge.utility

import android.app.Application

class HugeApp: Application() {

    override fun onCreate() {
        super.onCreate()
        PrefsHelper.init(this)
    }
}