package com.wavetechstudio.theiteratorpatternusingbuiltiniterator.customObjectsIterator

class Player(private val name: String, private val rank: Int, private val avergae: Double) {

    override fun toString(): String {
        return "Name: $name, Rank: $rank, Average: $avergae"
    }
}