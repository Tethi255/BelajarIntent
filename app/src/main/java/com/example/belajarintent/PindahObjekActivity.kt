package com.example.belajarintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class PindahObjekActivity : AppCompatActivity() {

    private lateinit var tvPenerimaObjek : TextView

    companion object{
        const val EXTRA_CARS = "extra_cars"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_objek)

        tvPenerimaObjek = findViewById(R.id.tv_penerima_objek)

        val cars: cars = intent.getParcelableExtra<cars>(EXTRA_CARS) as cars
        val text ="Merk: ${cars.merk.toString()} \nTahun: ${cars.tahun.toString()} \nPlat: ${cars.plat.toString()}"
        tvPenerimaObjek.text = text
    }
}