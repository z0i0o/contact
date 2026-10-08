package com.depi.contact


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.depi.contact.databinding.UserItemBinding


class ContactAdapter(
    private val contactList: List<Contact>):
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContactViewHolder {
      val binding = UserItemBinding.inflate(
          LayoutInflater.from(parent.context),
          parent,
          false)

        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ContactViewHolder,
        position: Int
    ) {
       val contact = contactList[position]
        Glide.with(holder.itemView.context)
            .load(contact.img)
            .into(holder.binding.ContactImg)
        holder.binding.ContactName.text = contact.name
        holder.binding.ContactNumber.text = contact.phoneNumber
    }

    override fun getItemCount() = contactList.size

    class ContactViewHolder(val binding: UserItemBinding) : RecyclerView.ViewHolder(binding.root)
}