package com.example.room_rutasgps_mb.Ruta

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface RutaDao {

    @Insert
    fun insert(ruta: Ruta):Long
    @Delete
    fun delete(ruta: Ruta)
    @Update
    fun update(ruta: Ruta)

    @Query("SELECT * FROM ruta")
    fun getAll(): List<Ruta>
}
