package io.github.agrania.belajararsitekturmvp.presenter

import io.github.agrania.belajararsitekturmvp.KelilingView

class KelilingPresenter(
        private val kelilingview: KelilingView
) {
    fun hitungKelilingPersegiPanjang (panjang: Float, lebar: Float) {
        val hasil = 2 * (panjang + lebar)

        kelilingview.hasilKelilingPersegiPanjang(hasil)
    }
}