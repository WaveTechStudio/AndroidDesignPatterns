package com.wavetechstudio.theiteratorpatternusingbuiltiniterator.customObjectsIterator

import java.util.*

class CustomPlayersIterator(private val players: LinkedList<Player>) : Iterator<Player> {


    private var position: Int = 0

    /**
     * Set the pointer to the first position and return first element
     */
    fun first() {
        position = 0
    }

    /**
     * Returns the next element
     */
    override fun next(): Player {
        return players.get((position++))
    }

    /**
     * Returns true if next element exists otherwise returns false
     */
    override fun hasNext(): Boolean {
        return (position < players.size)
    }

    /**
     * Returns the current element
     */
    fun currentItem(): Player {
        return players.get(position)
    }


}