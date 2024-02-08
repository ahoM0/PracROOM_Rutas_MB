package com.example.room_rutasgps_mb.Coordenada

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.room_rutasgps_mb.Ruta.Ruta

@Entity(tableName = "coordenada")
data class Coordenada(
    var Rutaid : Long? = null,

    @ColumnInfo(name="latitud")
    var latitud:Long?=null,

    @ColumnInfo(name="longitud")
    var longitud:Long?=null,

    @ColumnInfo(name="altura")
    var altura:Long?=null
)
