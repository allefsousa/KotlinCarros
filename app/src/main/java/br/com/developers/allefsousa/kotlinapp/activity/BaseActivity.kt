package br.com.developers.allefsousa.kotlinapp.activity

import android.content.Context
import android.support.v7.app.AppCompatActivity

/**
 * Created by allef on 09/07/2018.
 */
// Classe vai prover metodos para todas as activityes
open class BaseActivity: AppCompatActivity() {
    // proprieda para acessar o context de qualquer lugar
    protected  val context: Context get() = this;


}