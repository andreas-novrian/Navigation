package com.ppb.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ppb.navigation.databinding.FragmentInputProsesBinding


class InputProsesFragment : Fragment() {
    private lateinit var binding : FragmentInputProsesBinding
    private val args by navArgs<InputProsesFragmentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInputProsesBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvResepMakanan.text = args.resep
    }
}