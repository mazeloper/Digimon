package com.mazeloper.dev.digimoncard.feature.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mazeloper.dev.digimoncard.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewModel: MainViewModel by lazy { getViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initObserver()

        viewModel.fetchDigimonCard()
    }

    private fun initObserver() {
        viewModel.digimonCard.observe(this) { vo ->

        }
    }
}