package com.wavetechstudio.theiteratorpatternusingbuiltiniterator

class AustralianTeam : Subjects {

    private val players: ArrayList<String> = ArrayList()

    init {
        players.add("Aron Finch")
        players.add("David Warner")
        players.add("Steven Smith")
        players.add("Mitchel Starc")
        players.add("Khwaja")
    }

    /**
     * Creating Player's Iterator
     */
    override fun createIterator(): PlayersIterator {
        return PlayersIterator(players)
    }

}