package com.example.pfinaltienda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pfinaltienda.databinding.ActivityInicialBinding

class InicialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInicialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicialBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnGotLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}