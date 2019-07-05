package com.wavetechstudio.theiteratorpatternusingbuiltiniterator

class PlayersIterator(private val players: ArrayList<String>) : Iterator<String> {


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
    override fun next(): String {
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
    fun currentItem(): String {
        return players.get(position)
    }


}