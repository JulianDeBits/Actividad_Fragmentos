package com.example.actividadfragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.example.actividadfragments.frags.RedesSocialesFragment.Companion.ARG_APELLIDO
import com.example.actividadfragments.frags.RedesSocialesFragment.Companion.ARG_NOMBRE



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null){

            val bundle = bundleOf(ARG_NOMBRE to "Juliana", ARG_APELLIDO to "Perez")



        }
    }

}