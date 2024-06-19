package com.kolbeev.digcrimea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)
        val match: LinearLayout = view.findViewById(R.id.match)
        match.setOnClickListener {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, DetailsFragment())
                ?.addToBackStack(null)
                ?.commit()
        }

        // Inflate the layout for this fragment
        return view
    }


}