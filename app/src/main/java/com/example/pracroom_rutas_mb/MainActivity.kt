package com.example.pracroom_rutas_mb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.fragment.app.commit
import com.example.pracroom_rutas_mb.Ruta.RutasFragment
import com.example.pracroom_rutas_mb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val gpsviewmodel : GPSViewmodel by viewModels()
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //
        setSupportActionBar(binding.barraHerramientas)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //
        this.gpsviewmodel.init(this)
    }

    // Menu inflate
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    //
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                val fm = supportFragmentManager
                val f = fm.findFragmentById(R.id.contenedorFragmentos)// fragmentOne.isVisible()
                if (!(f is HomeFragment)) {
                    onBackPressedDispatcher.onBackPressed()
                }
                return super.onOptionsItemSelected(item)
            }

            R.id.item_rutas -> {
                val fm = supportFragmentManager

                fm.commit {
                    replace(R.id.contenedorFragmentos, RutasFragment.newInstance())
                    addToBackStack("listado rutas")
                }
                return super.onOptionsItemSelected(item)
            }

            R.id.item_coordenadas -> {
                val fm = supportFragmentManager

                fm.commit {
                    replace(R.id.contenedorFragmentos, CoordenadasFragment.newInstance())
                    addToBackStack("listado coordenadas")
                }
                return super.onOptionsItemSelected(item)
            }

            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }
}