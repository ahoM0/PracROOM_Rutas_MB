package com.example.pracroom_rutas_mb

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.room_rutasgps_mb.Coordenada.Coordenada
import com.example.room_rutasgps_mb.Coordenada.CoordenadaRepository
import com.example.room_rutasgps_mb.Ruta.Ruta
import com.example.room_rutasgps_mb.Ruta.RutaRepository

class GPSViewmodel : ViewModel() {
    private lateinit var _context : Context

    // Repositorios
    lateinit var rutasRepository: RutaRepository
    lateinit var coordenadaRepository: CoordenadaRepository

    // Privadas
    private lateinit var _itemsrutas : MutableLiveData<MutableList<Ruta>>
    private lateinit var _itemscoordenadas : MutableLiveData<MutableList<Coordenada>>

    // Selected
    var selectedRuta = Ruta()
    var selectedCoordenada = Coordenada()

    // Getters
    public val itemsrutas : LiveData<MutableList<Ruta>>
        get() = _itemsrutas
    public val itemscoordenadas : LiveData<MutableList<Coordenada>>
        get() = _itemscoordenadas

    fun init(c:Context){
        this._context=c
        //
        this._itemsrutas = MutableLiveData()
        this._itemscoordenadas = MutableLiveData()
        // Inicializamos los repositorios pasandole el contexto
        this.rutasRepository = RutaRepository(c)
        this.coordenadaRepository = CoordenadaRepository(c)
        // Recibimos los valores de las tablas y los guardamos en nuestras variables
        this._itemsrutas.value = this.rutasRepository.getAll()
        this._itemscoordenadas.value = this.coordenadaRepository.getAll()

    }

    // Metodo actualizar
    private fun update() {
        // Actualizamos los valores para que el live data actue y se actualicen los valores
        var valuesRuta = this._itemsrutas.value
        this._itemsrutas.value = valuesRuta

        var valuesCoordenada = this._itemscoordenadas.value
        this._itemscoordenadas.value = valuesCoordenada
    }

    //



}