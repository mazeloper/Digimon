package com.mazeloper.dev.digimoncard.feature.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mazeloper.dev.digimoncard.data.repository.remote.DigimonCardRepository
import com.mazeloper.dev.digimoncard.data.vo.DigimonVo
import io.reactivex.rxjava3.disposables.CompositeDisposable

class MainViewModel(private val repository: DigimonCardRepository) : ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    private val _digimonCard = MutableLiveData<List<DigimonVo>>()
    val digimonCard: LiveData<List<DigimonVo>>
        get() = _digimonCard

    fun fetchDigimonCard() {
        val disposable = repository.fetchDigimonCardList()
            .subscribe({
                _digimonCard.postValue(it)
            }, {

            })
        compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}