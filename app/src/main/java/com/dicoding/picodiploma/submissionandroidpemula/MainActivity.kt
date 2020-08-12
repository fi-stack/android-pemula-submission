package com.dicoding.picodiploma.submissionandroidpemula

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.picodiploma.submissionandroidpemula.adapter.ListCharacterAdapter
import com.dicoding.picodiploma.submissionandroidpemula.model.Character
import com.dicoding.picodiploma.submissionandroidpemula.model.CharactersData

class MainActivity : AppCompatActivity() {
    private lateinit var rvCharacters: RecyclerView
    private var list: ArrayList<Character> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCharacters = findViewById(R.id.rv_characters)
        rvCharacters.setHasFixedSize(true)

        list.addAll(CharactersData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvCharacters.layoutManager = LinearLayoutManager(this)
        val listCharacterAdapter =
            ListCharacterAdapter(
                list
            )
        rvCharacters.adapter = listCharacterAdapter

        listCharacterAdapter.setOnItemClickCallback(object:ListCharacterAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Character) {
                showSelectedCharacter(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {

            }
            R.id.action_about -> {

            }
        }
    }

    private fun showSelectedCharacter(character: Character) {
        Toast.makeText(this, "Kamu memilih " + character.name, Toast.LENGTH_SHORT).show()
    }
}