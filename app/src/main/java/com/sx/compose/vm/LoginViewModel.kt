package com.sx.compose.vm

import androidx.lifecycle.MutableLiveData
import com.sx.compose.framework.tools.getValue
import com.sx.compose.framework.tools.setValue

/**
 * @Description
 * @Author 梁浩文
 * @Date 2022/2/22 11:04
 */
open class LoginViewModel : BaseViewModel() {
    var emailLifeData by MutableLiveData<String>()
    var passwordLiveData by MutableLiveData<String>()
}





