package com.example.room_rutasgps_mb.Coordenada

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Coordenada(
    @PrimaryKey(autoGenerate = true)
    var id : Long? = null,
    @ColumnInfo(name="latitud")
    var latitud:Long?=null,
    @ColumnInfo(name="longitud")
    var longitud:Long?=null,
    @ColumnInfo(name="altura")
    var altura:Long?=null
)
