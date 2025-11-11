package com.example.mcvmorning

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mcvmorning.data.QuoteRepository

class MainActivity : AppCompatActivity() {

    private val quoteRepository = QuoteRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quoteTextView: TextView = findViewById(R.id.quoteTextView)
        val authorTextView: TextView = findViewById(R.id.authorTextView)
        val newQuoteButton: Button = findViewById(R.id.newQuoteButton)

        newQuoteButton.setOnClickListener {
            displayRandomQuote(quoteTextView, authorTextView)
        }

        displayRandomQuote(quoteTextView, authorTextView)
    }

    private fun displayRandomQuote(quoteTextView: TextView, authorTextView: TextView) {
        val quote = quoteRepository.getRandomQuote()
        quoteTextView.text = quote.text
        authorTextView.text = "- ${quote.author}"
    }
}
