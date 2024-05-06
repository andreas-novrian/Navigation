package com.ppb.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ppb.navigation.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnTransaksi.setOnClickListener {
                findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToTransaksiFragment()
                )
            }
            btnInput.setOnClickListener {
                findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToInputResepFragment()
                )
            }
            btnSaldo.setOnClickListener {
                findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToSaldoFragment()
                )
            }
        }
    }
}