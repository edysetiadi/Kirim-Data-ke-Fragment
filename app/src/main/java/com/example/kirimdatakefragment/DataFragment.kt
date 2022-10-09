package com.example.kirimdatakefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.*
import android.view.LayoutInflater
import android.widget.TextView


class DataFragment : Fragment() {
    override fun onCreateView(
        inflater : LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val v = inflater.inflate(R.layout.fragment_data, container ,false)
        val TvData = v.findViewById<TextView>(R.id.TvData)
        if (arguments != null) {
            val nim = requireArguments().getString("nim")
            val nama = requireArguments().getString("nama")
            val prodi = requireArguments().getString("prodi")
            TvData.text ="""
                NIM : $nim
                Nama : $nama
                Program studi : $prodi
            """.trimIndent()
        }
        return v

    }
}