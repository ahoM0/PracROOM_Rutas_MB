package com.example.room_rutasgps_mb.Ruta

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.room_rutasgps_mb.Coordenada.Coordenada

@Entity(tableName="ruta")
data class Ruta(
    @PrimaryKey(autoGenerate = true)
    var id : Long? = null,

    @ColumnInfo(name="nombre")
    var nombre : String="",

    @ColumnInfo(name="descripcion")
    var descripcion: String="",

    @ColumnInfo(name="activo")
    var activo:Boolean?=null,

    @ColumnInfo(name="dificultad")
    var dificultad:Int?=null,

    @ColumnInfo(name="coordenadas")
    var coordenadas: List<Coordenada>?=null
)
