package com.tali.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tali.contactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    private fun displayContacts(){
        val contact1=contactData("","Nathalie","0732352616","nath@gmail.com")
        val contact2=contactData("","Idaya","0733251632","idaya@gmail.com")
        val contact3=contactData("","Pauline","0732873279","paula@gmail.com")
        val contact4=contactData("","Nathalie","0732352616","nath@gmail.com")
        val contact5=contactData("","Nathalie","0732352616","nath@gmail.com")
        val contact6=contactData("","Nathalie","0732352616","nath@gmail.com")
        val contact7=contactData("","Nathalie","0732352616","nath@gmail.com")
        val list= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        val tvAdapter=ContactAdapter(list)
        binding.rvList.layoutManager=LinearLayoutManager(this)
        binding.rvList.adapter=tvAdapter
    }
}        val contact1=contactData("","Nathalie","0732352616","nath@gmail.com")
