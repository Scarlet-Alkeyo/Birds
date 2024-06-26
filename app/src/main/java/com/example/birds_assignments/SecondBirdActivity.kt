

package com.example.birds_assignments

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


import com.example.birds_assignments.databinding.ActivitySecondBirdBinding

class SecondBirdActivity : ComponentActivity() {
    private lateinit var binding: ActivitySecondBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev.setOnClickListener {
            finish()
        }
        binding.btnNext2.setOnClickListener {
            val intent = Intent(this, ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1497206365907-f5e630693df0?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fGJpcmR8ZW58MHx8MHx8fDA%3D ")
            (binding.secondBird)
    }
}
