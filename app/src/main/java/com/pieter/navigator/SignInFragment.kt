package com.pieter.navigator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class SignInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =
            inflater.inflate(R.layout.fragment_sign_in, container, false)

        view.findViewById<Button>(R.id.signInComplete).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_signInFragment_to_splashFragment)
        }

        view.findViewById<TextView>(R.id.goSignUp).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_signInFragment_to_signUpFragment)
        }
        return view
    }


}