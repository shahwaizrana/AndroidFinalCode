package com.example.skincare.Fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.skincare.Adapter.SyptomsAdapter
import com.example.skincare.Constants.Constant
import com.example.skincare.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [SyptomsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SyptomsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_syptoms, container, false)
        var remedies: List<FragmentModel> =FragmentModel.initialize(Constant.ACNE_SYPTOMS_TAB);

        val activity=activity as Context;
        val recyclerView=view.findViewById<RecyclerView>(R.id.remedies_recyclerview);
        recyclerView.layoutManager= LinearLayoutManager(activity.applicationContext)
        recyclerView.adapter= SyptomsAdapter(activity,remedies)



        return view;


    }


}