package com.sx.compose.framework.tools

import androidx.lifecycle.MutableLiveData
import kotlin.reflect.KProperty

/**
 * @Description
 * @Author 梁浩文
 * @Date 2022/2/22 11:05
 */
@Suppress("NOTHING_TO_INLINE")
inline operator fun <T> MutableLiveData<T>.getValue(thisObj: Any?, property: KProperty<*>): T = value!!

@Suppress("NOTHING_TO_INLINE")
inline operator fun <T> MutableLiveData<T>.setValue(thisObj: Any?, property: KProperty<*>, value: T) {
    this.value = value
}