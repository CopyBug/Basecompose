package com.sx.compose.module

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.sx.compose.ui.theme.MyAppTheme

/**
 * @Description
 * @Author 梁浩文
 * @Date 2022/2/22 11:03
 */

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            MyAppTheme {
                NavigationRouterConfig(this)
            }
        }
    }
}