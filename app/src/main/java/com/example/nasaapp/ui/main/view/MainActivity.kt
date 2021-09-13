package com.example.nasaapp.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nasaapp.R
import com.example.nasaapp.databinding.MainActivityBinding
import java.lang.reflect.Array.newInstance

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(binding.container.id, MainFragment.newInstance())
                .commitNow()
        }
    }
}