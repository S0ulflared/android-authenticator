package com.josdem.authenticator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.josdem.authenticator.databinding.FragmentMessageBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class MessageFragment : Fragment() {
    private var _binding: FragmentMessageBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
