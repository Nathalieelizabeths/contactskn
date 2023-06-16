package com.tali.contactlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tali.contactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            var intent=Intent(this,createAccount::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }

    private fun displayContacts() {
        val contact1 = contactData("https://images.unsplash.com/photo-1488426862026-3ee34a7d66df?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Nathalie", "0732352616", "nath@gmail.com")
        val contact2 = contactData("https://images.unsplash.com/photo-1557296387-5358ad7997bb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8ZmFjZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Idaya", "0733251632", "idaya@gmail.com")
        val contact3 = contactData("https://images.unsplash.com/photo-1554151228-14d9def656e4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8ZmFjZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Pauline", "0732873279", "paula@gmail.com")
        val contact4 = contactData("https://images.unsplash.com/photo-1616766098946-e4fabb7d6da0?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fGZhY2V8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60", "Roseline", "0732352616", "nath@gmail.com")
        val contact5 = contactData("https://images.unsplash.com/photo-1531746020798-e6953c6e8e04?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjF8fGZhY2V8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60", "Anette", "0732352616", "nath@gmail.com")
        val contact6 = contactData("https://images.unsplash.com/photo-1534528741775-53994a69daeb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mjd8fGZhY2V8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60", "Eunice", "0732352616", "nath@gmail.com")
        val contact7 = contactData("https://images.unsplash.com/photo-1618835962148-cf177563c6c0?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzN8fGZhY2V8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60", "Rebeccah", "0732352616", "nath@gmail.com")
        val list = listOf(contact1, contact2, contact3, contact4, contact5, contact6, contact7)
        val tvAdapter = ContactAdapter(list)
        binding.rvList.layoutManager = LinearLayoutManager(this)
        binding.rvList.adapter = tvAdapter
    }
}

