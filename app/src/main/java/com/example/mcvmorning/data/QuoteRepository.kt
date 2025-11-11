package com.example.mcvmorning.data

class QuoteRepository {
    private val quotes = listOf(
        Quote("The only way to do great work is to love what you do.", "Steve Jobs"),
        Quote("Strive not to be a success, but rather to be of value.", "Albert Einstein"),
        Quote("The mind is everything. What you think you become.", "Buddha"),
        Quote("An unexamined life is not worth living.", "Socrates"),
        Quote("The best way to predict the future is to create it.", "Peter Drucker")
    )

    fun getRandomQuote(): Quote {
        return quotes.random()
    }
}
