package com.stephen.nb.test.compose.common

import android.widget.Toast
import com.sx.compose.framework.app.MyApplication

object Utils {
    fun showToast(msg: String?="Empty Msg") {
        Toast.makeText(MyApplication.appContext, msg.toString(), Toast.LENGTH_SHORT).show()
    }
}