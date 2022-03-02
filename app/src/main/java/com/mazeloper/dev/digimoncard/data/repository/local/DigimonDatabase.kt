package com.mazeloper.dev.digimoncard.data.repository.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mazeloper.dev.digimoncard.data.vo.DigimonVo

@Database(entities = [DigimonVo::class], version = 1)
abstract class DigimonDatabase : RoomDatabase() {
    abstract fun digimonDao(): DigimonDao
}