package com.example.androiddonuttracker.donutlist

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.androiddonuttracker.databinding.DonutListFragmentBinding

class DonutListFragment : Fragment() {

    private lateinit var viewModel: DonutListViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       val binding = DonutListFragmentBinding.bind(view)
       binding.fab.setOnClickListener {
            it.findNavController().navigate(
                DonutListFragmentDirections.actionDonutListFragmentToDonutDailogFragment()
            )
       }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return DonutListFragmentBinding.inflate(inflater, container,false).root
    }

}