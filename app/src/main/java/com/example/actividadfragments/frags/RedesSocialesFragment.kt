package com.example.actividadfragments.frags

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.actividadfragments.R

class RedesSocialesFragment : Fragment() {
    private var nombre: String? = null
    private var apellido: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            nombre = it.getString(ARG_NOMBRE)
            apellido = it.getString(ARG_APELLIDO)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_redes_sociales, container, false)
    }

    companion object {

        private const val ARG_NOMBRE = "NombreStandar"
        private const val ARG_APELLIDO = "ApellidoStandar"

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RedesSocialesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_NOMBRE, nombre)
                    putString(ARG_APELLIDO, apellido)
                }
            }
    }
}