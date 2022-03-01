package com.mazeloper.dev.digimoncard.di

import com.mazeloper.dev.digimoncard.feature.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val ViewModelModule = module {
    viewModel { MainViewModel(get()) }
}