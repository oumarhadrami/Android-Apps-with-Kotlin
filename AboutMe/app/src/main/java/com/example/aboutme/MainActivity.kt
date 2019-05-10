package com.example.aboutme

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

        lateinit var doneButton: Button
        lateinit var nicknameTextView: TextView
        lateinit var nicknameEditText: EditText

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doneButton = findViewById(R.id.done_button)
        nicknameTextView = findViewById(R.id.nickname_text)
        nicknameEditText = findViewById(R.id.nickname_edit)

        doneButton.setOnClickListener { displayNickname(it) }
    }

    private fun displayNickname(view: View) {
        val nickname: String = nicknameEditText.text.toString()
        nicknameEditText.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE
        nicknameTextView.text = nickname


        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}
