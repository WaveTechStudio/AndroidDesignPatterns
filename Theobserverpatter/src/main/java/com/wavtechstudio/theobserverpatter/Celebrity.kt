package com.wavtechstudio.theobserverpatter

class Celebrity(private val celebrityName: String) : Subject {

    private val observersList: ArrayList<Observer> = ArrayList()

    /**
     * Do tweet, Celebrity does tweet from here
     */
    fun tweet(tweet: String) {
        notifyAllObserver(tweet)
    }

    /**
     * Register observer so that we can notify about tweets
     */
    override fun registerObserver(observer: Observer) {
        observersList.add(observer)
    }

    /**
     * Un-register observer so that it cannot be notified about tweets
     */
    override fun unRegisterObserver(observer: Observer) {
        observersList.remove(observer)
    }

    /**
     * Notify all registered observers so that they can get latest tweet
     */
    override fun notifyAllObserver(tweet: String) {
        for (observer in observersList) {
            observer.update(celebrityName, tweet)
        }
    }
}