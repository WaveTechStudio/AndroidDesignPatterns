package com.wavetechstudio.theiteratorpattern

class PakistaniTeam : Subjects {

    private val players: ArrayList<String> = ArrayList()


    init {
        players.add("Shahid Afridi")
        players.add("Baber Azam")
        players.add("M. Aamir")
        players.add("Wahab Riaz")
        players.add("Shoaib Akhtar")
        players.add("Imran Khan")
        players.add("Waseem Akram")
    }

    /**
     * Creating Player's Iterator
     */
    override fun createIterator(): Iterator {
        return PlayersIterator(players)
    }


    /**
     * Creating Players Iterator class for Pakistani Team
     */
    private class PlayersIterator(private val players: ArrayList<String>) : Iterator {

        private var position: Int = 0

        /**
         * Set the pointer to the first position and return first element
         */
        override fun first() {
            position = 0
        }

        /**
         * Returns the next element
         */
        override fun next(): String {
            return players.get((position++))
        }

        /**
         * Returns the current element
         */
        override fun currentItem(): String {
            return players.get(position)
        }

        /**
         * Returns true if next element exists otherwise returns false
         */
        override fun hasNext(): Boolean {
            return (position < players.size)
        }

    }
}