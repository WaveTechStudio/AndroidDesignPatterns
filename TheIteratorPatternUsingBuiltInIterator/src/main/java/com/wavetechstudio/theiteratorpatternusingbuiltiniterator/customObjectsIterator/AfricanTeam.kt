package com.wavetechstudio.theiteratorpatternusingbuiltiniterator.customObjectsIterator

import java.util.*

class AfricanTeam : CustomSubject {

    private val players: LinkedList<Player> = LinkedList()

    init {
        players.add(Player("Hashim Amla", 1, 48.5))
        players.add(Player("Quinton de Kock", 3, 45.5))
        players.add(Player("JP Duminy", 9, 39.5))
        players.add(Player("Faf du Plessis", 5, 52.5))
    }

    override fun createCustomIterator(): CustomPlayersIterator {
        return CustomPlayersIterator(players)
    }
}