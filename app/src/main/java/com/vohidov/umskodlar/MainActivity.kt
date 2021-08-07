package com.vohidov.umskodlar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgSpeed.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://fast.com/"))
            startActivity(intent)
        }
    }

    override fun navigateUpTo(upIntent: Intent?): Boolean {
        return Navigation.findNavController(this, R.id.navHost).navigateUp()
    }
}