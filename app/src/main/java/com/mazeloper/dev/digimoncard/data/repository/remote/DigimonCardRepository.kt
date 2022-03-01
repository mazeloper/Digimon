package com.mazeloper.dev.digimoncard.data.repository.remote

import com.mazeloper.dev.digimoncard.data.repository.remote.ApiService
import com.mazeloper.dev.digimoncard.data.vo.DigimonVo
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

class DigimonCardRepository(private val apiService: ApiService) {

    fun fetchDigimonCardList(): Single<List<DigimonVo>> {
        return apiService.getDigimonCard()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}