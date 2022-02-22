package com.sx.compose.vm

import androidx.lifecycle.ViewModel
import com.sx.compose.framework.app.MyApplication
import kotlinx.coroutines.flow.MutableStateFlow

open class BaseViewModel : ViewModel() {
    val appTheme = MutableStateFlow(MyApplication.currentTheme)
    
    data class CommonString(var string: String)
    data class CommonBoolean(var boolean: Boolean)
}