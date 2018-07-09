package br.com.developers.allefsousa.kotlinapp.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import android.view.Gravity
import android.view.MenuItem
import br.com.developers.allefsousa.kotlinapp.R
import br.com.developers.allefsousa.kotlinapp.extensions.setupToolbar
import br.com.developers.allefsousa.kotlinapp.extensions.toast


class MainActivity : BaseActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbar(R.id.toolbar)
        setupNavigationDrawer()



    }

    private fun setupNavigationDrawer() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        val togle = ActionBarDrawerToggle(
                this,drawer,toolbar,R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        )
        drawer.addDrawerListener(togle)
        togle.syncState()
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_item_carros_todos -> {
                toast("clicou em carros")
            }
            R.id.nav_item_carros_classicos -> {
                toast("Clicou em carros classicos")
            }
            R.id.nav_item_carros_esportivos -> {
                toast("clicou em carros esportivos")
            }
            R.id.nav_item_carros_luxo -> {
                toast("Clicou em carros de luxo")
            }
            R.id.nav_item_site_livro -> {
                toast("Clicou em site do livro")
            }
            R.id.nav_item_settings -> {
                toast("Clicou em configuracoes")
            }


        }
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
