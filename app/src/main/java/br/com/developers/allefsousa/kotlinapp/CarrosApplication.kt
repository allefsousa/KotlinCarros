package br.com.developers.allefsousa.kotlinapp.activity

import android.app.Application

/**
 * Created by allef on 09/07/2018.
 */
class CarrosApplication: Application() {
    private val TAG  = "CarrosApplication"
    override fun onCreate() {
        super.onCreate()
        appInstace = this

    }
    companion object {
        // singleton a classe application
        private var appInstace: CarrosApplication? = null
        fun getInstace():CarrosApplication{
            if (appInstace == null){
                throw IllegalStateException("Configure a classe de aplication n oandroid manifest")
            }
            return appInstace!!
        }
    }
}