package dev.chepkoech.mytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import dev.chepkoech.mytwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
        var tweet = Tweet("","Cheko","@cheko","I love laughing","","","","")
        var tweet1 = Tweet("","Chela","@chela","I love fun","","","","")
        var tweet2 = Tweet("","David","@dave","I love disturbing","","","","")
        var tweet3 = Tweet("","Brian","@brayo","Kenya is on fire loving it so much #tembeaKenya","","","","")
        var tweet4 = Tweet("","James","@jemo","Just finished my #100days of code","","","","")
        var tweet5 = Tweet("","Faith","@fay","I can't believe I made it","","","","")
        var tweet6 = Tweet("","Ken","@ken","I got confirmed for an internship today","","","","")
        var tweet7 = Tweet("","Brenda","@bree","Liking the view","","","","")
        var tweet8 = Tweet("","Marlin","@marlo","Loved my heavy breakfast today, you all should have #cereo for breakfast. Siku njema honekana asubuhi","","","","")
        var tweet9 = Tweet("","Ann","@annie","Loved what Elon said","","","","")
        var tweet10 = Tweet("","Elsie","@elsy","Heading to Mom's place #Ushagomanenoz","","","","")
        var tweet11 = Tweet("","Tom","@tommy","Missing McRory from Peaky Blinders ","","","","")
        var tweet12 = Tweet("","Rayan","@rayo","Hey book lovers, my current read is The Originals, What are you reading?","","","","")
        var tweet13 = Tweet("","Steve","@stevo","","","","","")
        var tweet14 = Tweet("","Charles","@chalo","Not today SMH","","","","")
        var tweet15 = Tweet("","Kelvin","@kevo","Be as authentic as you can","","","","")
        var tweet16 = Tweet("","John","@jonte","Let's meet in Vasha! heart heart","","","","")

        var tweetList = listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9,tweet10,tweet11,tweet12,tweet13,tweet14,tweet15,tweet16)
        var tweetAdapter = TweetRVAdapter(tweetList)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        binding.rvTweets.adapter = tweetAdapter
    }
}