package com.example.androiddonuttracker.donutdailog

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.androiddonuttracker.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class DonutDailogFragment : BottomSheetDialogFragment() {

    companion object {
        fun newInstance() = DonutDailogFragment()
    }

    private lateinit var viewModel: DonutDailogViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.donut_dailog_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DonutDailogViewModel::class.java)
        // TODO: Use the ViewModel
    }

}