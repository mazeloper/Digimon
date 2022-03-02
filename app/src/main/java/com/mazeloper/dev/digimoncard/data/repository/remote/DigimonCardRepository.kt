package com.mazeloper.dev.digimoncard.data.repository.remote

import com.mazeloper.dev.digimoncard.data.repository.local.DigimonDao
import com.mazeloper.dev.digimoncard.data.vo.DigimonVo
import com.mazeloper.dev.digimoncard.util.JsLog
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

class DigimonCardRepository(private val apiService: ApiService, private val digimonDao: DigimonDao) {

    fun fetchDigimonCardList(): Single<List<DigimonVo>> {
        return apiService.getDigimonCard()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    fun insertAllCardList(data: List<DigimonVo>) {
        digimonDao.insertAll(data)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                JsLog.debug("성공 십세야!!!!!")
            }, {
                JsLog.error("에러 십세야!!!!!")
            })
    }
}