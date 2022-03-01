package com.mazeloper.dev.digimoncard.data.repository.local

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Query
import com.mazeloper.dev.digimoncard.data.vo.DigimonVo

@Dao
interface DigimonDao {
    @Query("SELECT * FROM digimon")
    fun selectCardList(): DataSource.Factory<Int, DigimonVo>
}