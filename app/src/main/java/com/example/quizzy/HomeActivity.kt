package com.example.quizzy

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {

    val levels =
        arrayOf("Newbie", "Between", "GOD")
    var selectedLevelIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        playButton.setOnClickListener {

            showAlertDialog()
        }
    }

    // Alert with selected level options, bonus : funny toasts
    private fun showAlertDialog() {
        val alertDialog =
            AlertDialog.Builder(this@HomeActivity)
        alertDialog.setTitle("How strong are you ?")
        alertDialog.setSingleChoiceItems(
            levels,
            selectedLevelIndex
        ) { dialog, which ->
            when (which) {
                0 -> {
                    selectedLevelIndex = which
                    Log.i("HOME", "Current level selected : $selectedLevelIndex")

                    Toast.makeText(
                        this@HomeActivity,
                        "No worries, it will be fine...",
                        Toast.LENGTH_LONG
                    ).show()
                }

                1 -> {
                    selectedLevelIndex = which
                    Log.i("HOME", "Current level selected : $selectedLevelIndex")

                    Toast.makeText(
                        this@HomeActivity,
                        "Let's upgrade a bit the difficulty",
                        Toast.LENGTH_LONG
                    ).show()
                }
                2 -> {
                    selectedLevelIndex = which
                    Log.i("HOME", "Current level selected : $selectedLevelIndex")

                    Toast.makeText(
                        this@HomeActivity,
                        "Are you really one ?",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
        val alert = alertDialog.create()
        alert.setCanceledOnTouchOutside(true)
        alert.show()
    }
}