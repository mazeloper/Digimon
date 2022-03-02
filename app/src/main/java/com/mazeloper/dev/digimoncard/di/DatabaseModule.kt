package com.mazeloper.dev.digimoncard.di

import androidx.room.Room
import com.mazeloper.dev.digimoncard.data.repository.local.DigimonDao
import com.mazeloper.dev.digimoncard.data.repository.local.DigimonDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val DatabaseModule = module {
    single<DigimonDatabase> {
        Room.databaseBuilder(
            androidApplication(),
            DigimonDatabase::class.java, "database"
        ).fallbackToDestructiveMigration()
            .build()
    }

    single<DigimonDao> { get<DigimonDatabase>().digimonDao() }
}