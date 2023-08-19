package com.example.pfinaltienda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import androidx.core.widget.addTextChangedListener
import com.example.pfinaltienda.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tilEmail.editText?.addTextChangedListener { text ->
            binding.btnLogin.isEnabled = validateEmailPassword(text.toString(), binding.tilPassword.editText?.text.toString())
        }

        binding.tilPassword.editText?.addTextChangedListener { text ->
            binding.btnLogin.isEnabled = validateEmailPassword(binding.tilEmail.editText?.text.toString(), text.toString())
        }

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnRegistrar.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }
    }

    private fun validateEmailPassword(email:String, password:String): Boolean{
        val validateEmail =email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
        val validatePassword = password.length >= 6
        return validateEmail && validatePassword
    }
}