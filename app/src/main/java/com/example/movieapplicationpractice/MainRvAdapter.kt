package com.example.movieapplicationpractice

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movieapplicationpractice.databinding.ItemMovieListBinding

class MainRvAdapter : RecyclerView.Adapter<MainRvAdapter.MainRvViewHolder>() {
    private val movieList = mutableListOf(
        Movie("https://movie-phinf.pstatic.net/20220727_209/1658912961873lVd2W_JPEG/movie_image.jpg?type=f125","한산 : 용의 출현"),
        Movie("https://movie-phinf.pstatic.net/20220720_283/1658284839003UzxoT_JPEG/movie_image.jpg?type=f125","미니언즈 2"),
        Movie("https://movie-phinf.pstatic.net/20220509_176/1652081912471yhg3N_JPEG/movie_image.jpg?type=m203_290_2","탑건 : 메버릭"),
        Movie("https://movie-phinf.pstatic.net/20220708_75/16572722362230AyHS_JPEG/movie_image.jpg?type=f125","외계+인 1부")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRvViewHolder {
        val binding = ItemMovieListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MainRvViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainRvViewHolder, position: Int) {
        holder.onBind(movieList[position])
    }

    override fun getItemCount(): Int = movieList.size

    class MainRvViewHolder(private val binding: ItemMovieListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(movie: Movie) {
            Glide.with(itemView).load(movie.imgUrl).into(binding.ivMovieProfileImage)
            binding.tvMovieTitle.text = movie.title
        }
    }
}
