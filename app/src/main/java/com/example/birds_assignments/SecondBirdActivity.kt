//package com.example.birds_assignments
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.ImageView
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import com.squareup.picasso.Picasso
//
//
//class SecondBirdActivity : AppCompatActivity() {
//    lateinit var binding:SecondBirdActivity
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = SecondBirdActivity.
//        setContentView(binding.root)
//
//        binding.btn_prev.setOnClickListener {
//            finish()
//        }
//        binding.btn_next2.setOnClickListener {
//            val intent = Intent(this, ThirdBirdActivity::class.java)
//            startActivity(intent)
//        }
//        Picasso.get().load("https://images.unsplash.com/photo-1591055749071-927e6ddffc82?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGJpcmR8ZW58MHx8MHx8fDA%3D")
//            .into(binding.second_bird)
//    }
//
//}



//package com.example.birds_assignments
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.ImageView
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import com.squareup.picasso.Picasso
//
//class SecondBirdActivity : ComponentActivity() {
//    private lateinit var binding:SecondBirdbinding // Use the generated binding class
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        // Use setContent instead of setContentView if you're using Compose
//        // setContent {... }
//
//        // Assuming you have a layout file named activity_second_bird.xml
//        binding = SecondBirdActivity.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.btn_Prev.setOnClickListener {
//            finish()
//        }
//        binding.btn_next2.setOnClickListener {
//            val intent = Intent(this, ThirdBirdActivity::class.java)
//            startActivity(intent)
//        }
//        Picasso.get().load("https://images.unsplash.com/photo-1591055749071-927e6ddffc82?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGJpcmR8ZW58MHx8MHx8fDA%3D")
//            .into(binding.secondBird)
//    }
//}

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
        Picasso.get().load("https://images.unsplash.com/photo-1591055749071-927e6ddffc82?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .into(binding.secondBird)
    }
}
