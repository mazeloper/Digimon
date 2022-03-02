package com.mazeloper.dev.digimoncard

import android.app.Application
import com.mazeloper.dev.digimoncard.di.DatabaseModule
import com.mazeloper.dev.digimoncard.di.NetworkModule
import com.mazeloper.dev.digimoncard.di.RepositoryModule
import com.mazeloper.dev.digimoncard.di.ViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class AppApplication : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@AppApplication)
            modules(
                ViewModelModule,
                RepositoryModule,
                DatabaseModule,
                NetworkModule
            )
        }
    }
}