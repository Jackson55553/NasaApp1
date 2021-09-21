package com.example.nasaapp.ui.main.chips

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.nasaapp.R
import com.example.nasaapp.databinding.FragmentChipsBinding
import com.example.nasaapp.ui.main.view.MainActivity
import com.example.nasaapp.ui.main.view.MainFragment
import com.google.android.material.chip.Chip


class ChipsFragment : Fragment() {
    private var _binding: FragmentChipsBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChipsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.chipGroup.setOnCheckedChangeListener { chipGroup, position ->
            chipGroup.findViewById<Chip>(position)?.let {
                Toast.makeText(context, "выбран ${it.text}", Toast.LENGTH_SHORT).show()
            }
        }
        binding.chipClose.setOnCloseIconClickListener {
            binding.chipClose.visibility = View.GONE
        }
        binding.buttonTheme.setOnClickListener {
            activity?.setTheme(R.style.Theme_NasaApp2)
            activity?.recreate()
        }
    }
}