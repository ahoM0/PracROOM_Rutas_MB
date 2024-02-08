package com.example.room_rutasgps_mb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.room_rutasgps_mb.Coordenada.CoordenadaDao
import com.example.room_rutasgps_mb.Ruta.RutaDao
import com.example.room_rutasgps_mb.Coordenada.Coordenada
import com.example.room_rutasgps_mb.Ruta.Ruta

@Database( entities = [Ruta::class, Coordenada::class], version = 6, exportSchema = true)
abstract class GPSDataBase : RoomDatabase() {

    // Instanciamos las funciones Dao
    abstract fun rutaDao() : RutaDao
    abstract fun coordenadaDao() : CoordenadaDao

    companion object{
        //Instanciamos la db
        private var instance : GPSDataBase? = null
        // Comprobamos si hay una instancia de la base de datos, si la hay la cargamos sino la creamos.
        fun getInstance(ctx : Context) : GPSDataBase{
            if (instance == null)
                instance = Room.databaseBuilder(ctx.applicationContext, GPSDataBase::class.java, "gps_database")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .addCallback(roomCallBack)
                    .build()
            return instance!!
        }

        private val roomCallBack = object :Callback(){
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
            }
        }
    }
}