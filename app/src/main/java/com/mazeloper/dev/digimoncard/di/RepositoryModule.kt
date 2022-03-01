package com.mazeloper.dev.digimoncard.di

import com.mazeloper.dev.digimoncard.data.repository.remote.DigimonCardRepository
import org.koin.dsl.module

val RepositoryModule = module {
    single { DigimonCardRepository(get()) }
}