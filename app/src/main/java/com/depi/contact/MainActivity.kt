package com.depi.contact

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.depi.contact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
        val contacts = listOf(
            Contact("https://randomuser.me/api/portraits/men/1.jpg", "أحمد محمد", "0123456789"),
            Contact("https://randomuser.me/api/portraits/women/2.jpg", "سارة علي", "0109876543"),
            Contact("https://randomuser.me/api/portraits/men/3.jpg", "محمود حسن", "0115544332"),
            Contact("https://randomuser.me/api/portraits/women/4.jpg", "ليلى محمود", "0156677889"),
            Contact("https://randomuser.me/api/portraits/men/5.jpg", "ياسين إبراهيم", "0122334455"),
            Contact("https://randomuser.me/api/portraits/women/6.jpg", "مريم يوسف", "0100998877"),
            Contact("https://randomuser.me/api/portraits/men/7.jpg", "عمر خالد", "0111222333"),
            Contact("https://randomuser.me/api/portraits/women/8.jpg", "نور الهدى", "0155667788"),
            Contact("https://randomuser.me/api/portraits/men/9.jpg", "مصطفى محمود", "0128877665"),
            Contact("https://randomuser.me/api/portraits/women/10.jpg", "هنا السيد", "0101122334")
        )
        val myAdapter = ContactAdapter(contacts)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = myAdapter
    }
}