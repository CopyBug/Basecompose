package com.sx.compose.framework.app

import android.app.Application
import com.stephen.nb.test.compose.common.CoilImageLoader
import com.sx.compose.ui.theme.AppTheme

class MyApplication: Application() {
    companion object{
        lateinit var appContext: MyApplication

        var currentTheme = AppTheme.Light
    }

    override fun onCreate() {
        super.onCreate()
        appContext = this
        CoilImageLoader.initImageLoader(this)
    }
}