package br.com.developers.allefsousa.kotlinapp.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.developers.allefsousa.kotlinapp.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
