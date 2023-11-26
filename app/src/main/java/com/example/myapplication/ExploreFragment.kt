package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ExploreFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_explore, container, false)

                val button1 = view.findViewById<Button>(R.id.button1)
                val button2 = view.findViewById<Button>(R.id.button2)
                val button3 = view.findViewById<Button>(R.id.button3)
                val button4 = view.findViewById<Button>(R.id.button4)
                val button5 = view.findViewById<Button>(R.id.button5)
                val button6 = view.findViewById<Button>(R.id.button6)

        // Set click listeners for the buttons
        button1.setOnClickListener {
            // Redirect to Activity1
            val intent = Intent(requireContext(), Activity1::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            // Redirect to Activity2
            val intent = Intent(requireContext(), Activity2::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            // Redirect to Activity3
            val intent = Intent(requireContext(), Activity3::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            // Redirect to Activity1
            val intent = Intent(requireContext(), Activity4::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            // Redirect to Activity2
            val intent = Intent(requireContext(), Activity5::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            // Redirect to Activity3
            val intent = Intent(requireContext(), Activity6::class.java)
            startActivity(intent)
        }


        return view
    }
}
