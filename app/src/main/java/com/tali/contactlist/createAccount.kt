package com.tali.contactlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tali.contactlist.databinding.ActivityCreateAccountBinding

class createAccount : AppCompatActivity() {
    lateinit var binding:ActivityCreateAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        binding= ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.btnsave.setOnClickListener {
            validate()
            clearerror()
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }








    fun validate():Boolean{
        var firstname =binding.etfirstname.text.toString()
        var secondname=binding.etSecondname.text.toString()
        var phonenumber=binding.etphoneno.text.toString()
        var email =binding.etemail.text.toString()
        var error=false

        if(firstname.isEmpty()){
            binding.etfirstname.error = "firstname is required"
            error=true
            }

        if(secondname.isEmpty()){
            binding.etSecondname.error ="secondname is required"
            error=true
        }
        if(phonenumber.isEmpty()){
            binding.etphoneno.error ="phonenumber is required"
            error=true
        }
        if (email.isEmpty()){
            binding.etemail.error ="email is required"
            error=true
        }
        return firstname.isNotBlank() && secondname.isNotBlank()&&phonenumber.isNotBlank()&&email.isNotBlank()
    }
    fun clearerror(){
        binding.etfirstname.error=null
        binding.etSecondname.error=null
        binding.etphoneno.error=null
        binding.etemail.error=null

    }

}