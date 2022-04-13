package com.example.jsontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONTokener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        json()
    }

    fun json() {
        val jsonString = """
        {
            "result": "ok",
            "vocaArr" : [
                        {"eng":"dog","kor":"개"},
                        {"eng":"dog","kor":"개"},
                        {"eng":"dog","kor":"개"}
                        ]
         },
         {
        
    """.trimIndent()

        val jObject = JSONObject(jsonString)
        val name = jObject.getString("name")
        val age = jObject.getString("age")
        val arr = jObject.getJSONArray("arr")
    }
}