package com.wavetechstudio.theiteratorpattern

interface Iterator {

    /**
     * Set the pointer to the first position and return first element
     */
    fun first()

    /**
     * Returns the next element
     */
    fun next(): String

    /**
     * Returns the current element
     */
    fun currentItem(): String

    /**
     * Returns true if next element exists otherwise returns false
     */
    fun hasNext(): Boolean
}