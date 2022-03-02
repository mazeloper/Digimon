package com.mazeloper.dev.digimoncard.data.repository.local

import androidx.paging.DataSource
import androidx.room.*
import com.mazeloper.dev.digimoncard.data.vo.DigimonVo
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

@Dao
interface DigimonDao {
    @Query("SELECT * FROM digimon")
    fun selectCardList(): DataSource.Factory<Int, DigimonVo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @TypeConverter
    fun insertAll(digimon: List<DigimonVo>): Completable
}