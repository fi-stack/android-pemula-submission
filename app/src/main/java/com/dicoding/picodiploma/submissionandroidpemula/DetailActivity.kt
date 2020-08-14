package com.dicoding.picodiploma.submissionandroidpemula

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.picodiploma.submissionandroidpemula.model.Character
import com.dicoding.picodiploma.submissionandroidpemula.model.CharactersData
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    private var list: ArrayList<Character> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.title = "Detail"
        list.addAll(CharactersData.listData)

        val index = intent.getIntExtra("index", 0)
        setData(index)
    }

    private fun setData(index: Int) {
        detailImage.setImageResource(list[index].photo)
        detailName.text = list[index].name
        detailDescription.text = list[index].detail
    }
}
