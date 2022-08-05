package com.example.movieapplicationpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.movieapplicationpractice.databinding.ActivityMainBinding


//var mockDate: Array<Movie> = [
//    Movie(imageURL: 'https://fuck.png', title: 'fuck'),
//
//Movie(imageURL: 'https://fuck.png', title: 'fuck'),
//Movie(imageURL: 'https://fuck.png', title: 'fuck'),
//Movie(imageURL: 'https://fuck.png', title: 'fuck'),
//Movie(imageURL: 'https://fuck.png', title: 'fuck'),
//Movie(imageURL: 'https://fuck.png', title: 'fuck'),
//Movie(imageURL: 'https://fuck.png', title: 'fuck'),
//
//]

var Movies : ArrayList<Movie> = arrayListOf(
    Movie("https://movie-phinf.pstatic.net/20220727_209/1658912961873lVd2W_JPEG/movie_image.jpg?type=f125","한산 : 용의 출현"),
    Movie("https://movie-phinf.pstatic.net/20220720_283/1658284839003UzxoT_JPEG/movie_image.jpg?type=f125","미니언즈 2"),
    Movie("https://movie-phinf.pstatic.net/20220509_176/1652081912471yhg3N_JPEG/movie_image.jpg?type=m203_290_2","탑건 : 메버릭"),
    Movie("https://movie-phinf.pstatic.net/20220708_75/16572722362230AyHS_JPEG/movie_image.jpg?type=f125","외계+인 1부")
)

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainButton.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}
