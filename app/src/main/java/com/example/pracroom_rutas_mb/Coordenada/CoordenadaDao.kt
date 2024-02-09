package com.example.room_rutasgps_mb.Coordenada

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CoordenadaDao {

    @Insert
    fun insert(coordenada: Coordenada):Long
    @Delete
    fun delete(coordenada: Coordenada)
    @Update
    fun update(coordenada: Coordenada)

    @Query("SELECT * FROM coordenada")
    fun getAll(): List<Coordenada>


}