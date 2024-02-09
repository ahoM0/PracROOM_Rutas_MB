package com.example.room_rutasgps_mb.Ruta

import android.content.Context
import com.example.room_rutasgps_mb.GPSDataBase

class RutaRepository (var context: Context) {

    private var _rutaDao : RutaDao

    init{
        val database = GPSDataBase.getInstance(context)
        _rutaDao = database.rutaDao()
    }

    fun insert(ruta:Ruta):Long{
        return this._rutaDao.insert(ruta)
    }

    fun delete(ruta: Ruta){
        this._rutaDao.delete(ruta)
    }

    fun update(ruta: Ruta){
        this._rutaDao.update(ruta)
    }

    fun getAll() : MutableList<Ruta>{
        return this._rutaDao.getAll().toMutableList()
    }

    fun save(){

    }

}