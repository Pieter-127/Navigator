package com.pieter.navigator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        view.findViewById<Button>(R.id.login).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_splashFragment_to_signInFragment)
        }
        view.findViewById<Button>(R.id.signUp).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_splashFragment_to_signUpFragment)
        }
        return view
    }
}