package com.example.pracroom_rutas_mb.Coordenada

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pracroom_rutas_mb.R

class DetailFragmentCoordenada : Fragment() {

    private var view : View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_detail_coordenada, container, false)


        return view
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            DetailFragmentCoordenada().apply {

            }
    }
}