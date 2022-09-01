package com.example.guided4_bundle_0852

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GD4BundleResult : AppCompatActivity() {
    private lateinit var nama: TextView
    private lateinit var nim: TextView
    private lateinit var fakultas: TextView
    private lateinit var prodi: TextView
    lateinit var mBundle: Bundle

    lateinit var vNama: String
    lateinit var vNim: String
    lateinit var vFakultas: String
    lateinit var vProdi: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        getBundle()
        setText()
    }

    fun getBundle() {
        mBundle = intent.getBundleExtra("register")!!
        vNama = mBundle.getString("nama")!!
        vNim = mBundle.getString("nim")!!
        vFakultas = mBundle.getString("fakultas")!!
        vProdi = mBundle.getString("prodi")!!
    }

    fun setText() {
        nama = findViewById(R.id.viewNama)
        nama.setText(vNama)
        nim = findViewById(R.id.viewNIM)
        nim.setText(vNim)
        fakultas = findViewById(R.id.viewFakultas)
        fakultas.setText(vFakultas)
        prodi = findViewById(R.id.viewProgramStudi)
        prodi.setText(vProdi)
    }
}