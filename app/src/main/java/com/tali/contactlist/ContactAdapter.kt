package com.tali.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.tali.contactlist.databinding.ContactListItemBinding
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactAdapter(var contactList: List<contactData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var current=contactList.get(position)
        var binding=holder.binding
        binding.tvName.text=current.name
        binding.tvPhone.text=current.phone
        binding.tvEmail.text=current.email

        Picasso
            .get()
            .load(current.image)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivLady)
    }

}

class ContactViewHolder(var binding:ContactListItemBinding):RecyclerView.ViewHolder(binding.root)