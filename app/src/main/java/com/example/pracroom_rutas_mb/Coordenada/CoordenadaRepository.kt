package com.example.room_rutasgps_mb.Coordenada

import android.content.Context
import com.example.room_rutasgps_mb.GPSDataBase
import com.example.room_rutasgps_mb.Ruta.Ruta
class CoordenadaRepository(var context: Context) {

    private var _coordenadaDao : CoordenadaDao

    init {
        val database = GPSDataBase.getInstance(context)
        _coordenadaDao = database.coordenadaDao()
    }

    fun insert(coordenada: Coordenada) : Long{
        return this._coordenadaDao.insert(coordenada)
    }

    fun delete(coordenada: Coordenada){
        this._coordenadaDao.delete(coordenada)
    }

    fun update(coordenada: Coordenada){
        this._coordenadaDao.update(coordenada)
    }

    fun getAll():List<Coordenada>{
        return this._coordenadaDao.getAll().toMutableList()
    }

    fun save(){

    }
}