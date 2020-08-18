package blackjack.domain

class Cards(cards: Set<Card>) {
    private val cards: MutableSet<Card> = cards.toMutableSet()

    fun add(newCard: Card): Set<Card> {
        cards.add(newCard)
        return cards.toSet()
    }

    fun size() = cards.size

    fun sumOfScores(): Int {
        val sum = cards.map { it.score() }.sumBy { it }
        return CardScore.sumWithAce(sum, hasAce())
    }

    private fun hasAce() = cards.any { it.isAce() }

    fun firstCard(): Card = cards.first()

    override fun toString(): String {
        return cards.joinToString { it.toString() }
    }
}