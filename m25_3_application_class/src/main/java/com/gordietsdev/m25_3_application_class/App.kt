package com.gordietsdev.m25_3_application_class

import android.app.Application
import android.content.res.Configuration

class App : Application() {

    val objectInAppClass = "Object"

    // Этот метод вызывается при старте приложения до того, как будут созданы другие компоненты приложения
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    // Вызывается при изменении конфигурации, например, поворот
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    // Этот метод вызывается, когда у системы остается мало оперативной памяти
    // и система хочет, чтобы запущенные приложения поумерили аппетиты
    override fun onLowMemory() {
        super.onLowMemory()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}