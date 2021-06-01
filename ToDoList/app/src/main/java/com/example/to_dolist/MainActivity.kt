package com.samderlust.todoappjava

import android.R
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    var button: Button? = null
    var inputText: EditText? = null
    var listView: ListView? = null
    var list: ArrayList<String>? = null
    fun onClickAdd(v: View?) {
        val text = inputText!!.text.toString()
        list!!.add(text)
        val adapter: ArrayAdapter<*> = ArrayAdapter(this, R.layout.simple_list_item_1, list)
        listView!!.adapter = adapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.addButton)
        inputText = findViewById(R.id.inputText)
        listView = findViewById(R.id.listView)
        list = ArrayList()
    }
}