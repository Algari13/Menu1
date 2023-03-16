package com.example.menu1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_opcion2) {
            val intent1 = Intent(this, pantalla2::class.java)
            this.startActivity(intent1)
            return true
        }
        if (id == R.id.action_opcion3) {
            val intent2 = Intent(this, pantalla3::class.java)
            this.startActivity(intent2)
            return true
        }
        return super.onOptionsItemSelected(item)
        }
}
