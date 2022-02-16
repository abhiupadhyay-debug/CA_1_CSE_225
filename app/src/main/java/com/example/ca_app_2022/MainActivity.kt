package com.example.ca_app_2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import javax.security.auth.Subject


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        var rating1 = findViewById<RatingBar>(R.id.rating_1)
        var rating2 = findViewById<RatingBar>(R.id.rating_2)
        var rating3 = findViewById<RatingBar>(R.id.rating_3)
        var rating4 = findViewById<RatingBar>(R.id.rating_4)
        var rating5 = findViewById<RatingBar>(R.id.rating_5)
        var review = findViewById<Button>(R.id.btn)
        var submit = findViewById<Button>(R.id.btn1)

        rating1.setOnRatingBarChangeListener { ratingBar, fl, b ->
            val msg = rating1.rating.toString()
            Toast.makeText(this , "Rating Given : $msg",Toast.LENGTH_SHORT).show()
        }
        rating2.setOnRatingBarChangeListener { ratingBar, fl, b ->
            val msg = rating2.rating.toString()
            Toast.makeText(this , "Rating Given : $msg",Toast.LENGTH_SHORT).show()
        }
        rating3.setOnRatingBarChangeListener { ratingBar, fl, b ->
            val msg = rating3.rating.toString()
            Toast.makeText(this , "Rating Given : $msg",Toast.LENGTH_SHORT).show()
        }
        rating4.setOnRatingBarChangeListener { ratingBar, fl, b ->
            val msg = rating4.rating.toString()
            Toast.makeText(this , "Rating Given : $msg",Toast.LENGTH_SHORT).show()
        }
        rating5.setOnRatingBarChangeListener { ratingBar, fl, b ->
            val msg = rating5.rating.toString()
            Toast.makeText(this , "Rating Given : $msg",Toast.LENGTH_SHORT).show()
        }
        review.setOnClickListener(View.OnClickListener {
            val msg = rating1.rating
            val msg2 = rating2.rating
            val msg3 = rating3.rating
            val msg4 = rating4.rating
            val msg5 = rating5.rating
            val mss = msg + msg2 + msg3 + msg4 + msg5
            if(mss <= 10.0){
                Toast.makeText(applicationContext,"Bad OverAll Rating = "
                        + mss + " by 25.0",Toast.LENGTH_SHORT).show()
            }
            else if(mss > 10.0 &&  mss <= 20.0){
                Toast.makeText(applicationContext,"Average OverAll Rating = "
                        + mss + " by 25.0",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(applicationContext,"Great OverAll Rating = "
                        + mss + " by 25.0",Toast.LENGTH_SHORT).show()
            }
        })
        submit.setOnClickListener {
            val intent = Intent(this,ThankYoupage::class.java)
            startActivity(intent)
        }
    }
}