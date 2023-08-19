package com.example.pfinaltienda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.pfinaltienda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtsaludo.text ="Hola triple HDP..."

        val fragmentView = supportFragmentManager.findFragmentById(R.id.fcv_navigation) as NavHostFragment
        val navController = fragmentView.navController
        binding.bnvTienda.setupWithNavController(navController)


    }
}