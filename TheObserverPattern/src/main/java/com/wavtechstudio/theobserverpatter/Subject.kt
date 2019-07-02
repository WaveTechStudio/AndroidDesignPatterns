package com.wavtechstudio.theobserverpatter

interface Subject {

    fun registerObserver(observer: Observer)
    fun unRegisterObserver(observer: Observer)
    fun notifyAllObserver(tweet: String)

}