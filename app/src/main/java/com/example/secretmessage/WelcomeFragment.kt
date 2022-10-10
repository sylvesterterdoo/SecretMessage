package com.example.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.findFragment
import androidx.navigation.findNavController

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_welcome, container, false)
        val startButton = rootView.findViewById<Button>(R.id.start)

        startButton.setOnClickListener {
            val navController = rootView.findNavController()
            navController.navigate(R.id.action_welcomeFragment_to_messageFragment)
        }
        return rootView
    }


}