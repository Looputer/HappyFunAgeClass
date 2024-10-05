package com.android.happymahuaclass

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class HappyFunAgeClassApplication : Application()
{
    companion object
    {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

}