package com.example.gmailrecyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar?.title = "Inbox"
        toolbar?.navigationIcon = ContextCompat.getDrawable(this,R.drawable.baseline_menu_24)
        var list = mutableListOf<MailItem>()
        val rnd: Random = Random
        recyclerView = findViewById(R.id.recyclerView)

        list.add(
            MailItem(
            Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)),
            "PT Hung",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "12:10 AM")
        )
        list.add(MailItem(
            Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)),
            "Hung PT",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "12:10 AM")
        )
        list.add(MailItem(
            Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)),
            "Phuong",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "12:10 AM")
        )
        list.add(MailItem(
            Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)),
            "Nguyen Phuong",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "12:10 AM")
        )
        list.add(MailItem(
            Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)),
            "Sender 1",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "12:10 AM")
        )
        list.add(MailItem(
            Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)),
            "Sender 2",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "12:10 AM")
        )
        list.add(MailItem(
            Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)),
            "Sender 3",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "12:10 AM")
        )
        list.add(MailItem(
            Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)),
            "Sender 4",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry",
            "12:10 AM")
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adt = CustomMailAdapter(list)
        recyclerView.apply {
            setHasFixedSize(true)
            adapter = adt
            addItemDecoration(DividerItemDecoration(this.context, DividerItemDecoration.HORIZONTAL))
        }

    }

}