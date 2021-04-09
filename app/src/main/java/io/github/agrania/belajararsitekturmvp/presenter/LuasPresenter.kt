package io.github.agrania.belajararsitekturmvp.presenter

import io.github.agrania.belajararsitekturmvp.LuasView

class LuasPresenter(
        private val luasview: LuasView
) {

    fun hitungLuasPersegiPanjang(panjang: Float, lebar: Float){
        val hasil = panjang * lebar

        luasview.hasilLuasPersegiPanjang(hasil)
    }
}