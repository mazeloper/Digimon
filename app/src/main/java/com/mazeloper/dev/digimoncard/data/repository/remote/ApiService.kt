package com.mazeloper.dev.digimoncard.data.repository.remote

import com.mazeloper.dev.digimoncard.data.vo.DigimonVo
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("search.php?type=digimon")
    fun getDigimonCard(
        @Query("n") name: String? = null,
        @Query("desc") desc: String? = null,
        @Query("color") color: String? = null,
        @Query("attribute") attribute: String? = null,
        @Query("card") card: String? = null,
        @Query("pack") pack: String? = null,
        @Query("sort") type: String? = null,
        @Query("sortdirection") sortdirection: String? = null,
        @Query("series") series: String? = null,
    ): Single<List<DigimonVo>>
}