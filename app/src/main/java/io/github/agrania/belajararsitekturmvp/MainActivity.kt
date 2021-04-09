package io.github.agrania.belajararsitekturmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import io.github.agrania.belajararsitekturmvp.presenter.KelilingPresenter
import io.github.agrania.belajararsitekturmvp.presenter.LuasPresenter

  class MainActivity : AppCompatActivity(), LuasView, KelilingView {

      private lateinit var presenterLuas: LuasPresenter
      private lateinit var presenterKeliling: KelilingPresenter
      private lateinit var etPanjang: EditText
      private lateinit var etLebar: EditText
      private lateinit var tvHasilLuasdanKelilingPersegiPanjang: TextView
      private lateinit var btnHitungLuasPersegiPanjang: Button
      private lateinit var btnHitungKelilingPersegiPanjang: Button

      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)

          presenterLuas = LuasPresenter(this)
          presenterKeliling = KelilingPresenter(this)

          etPanjang = findViewById(R.id.et_panjang)
          etLebar = findViewById(R.id.et_lebar)
          tvHasilLuasdanKelilingPersegiPanjang = findViewById(R.id.tv_hasil)
          btnHitungLuasPersegiPanjang = findViewById(R.id.btn_hitung_luas_persegi_panjang)
          btnHitungKelilingPersegiPanjang = findViewById(R.id.btn_hitung_keliling_persegi_panjang)

          btnHitungLuasPersegiPanjang.setOnClickListener {
              val panjang = etPanjang.text.toString().trim().toFloat()
              val lebar = etLebar.text.toString().trim().toFloat()

              presenterLuas.hitungLuasPersegiPanjang(panjang, lebar)

          }

          btnHitungKelilingPersegiPanjang.setOnClickListener {
              val panjang = etPanjang.text.toString().trim().toFloat()
              val lebar = etLebar.text.toString().trim().toFloat()

              presenterKeliling.hitungKelilingPersegiPanjang(panjang, lebar)
          }
      }

      override fun hasilLuasPersegiPanjang(luas: Float) {
          tvHasilLuasdanKelilingPersegiPanjang.text = luas.toString()
      }

      override fun hasilKelilingPersegiPanjang(keliling: Float) {
          tvHasilLuasdanKelilingPersegiPanjang.text = keliling.toString()
      }
  }