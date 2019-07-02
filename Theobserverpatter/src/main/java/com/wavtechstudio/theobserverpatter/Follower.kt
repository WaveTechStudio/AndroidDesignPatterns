package com.wavtechstudio.theobserverpatter

class Follower(private val fanName: String) : Observer {

    override fun update(name: String, tweet: String) {
        println("$fanName has received the tweet. $tweet from $name")
    }
}