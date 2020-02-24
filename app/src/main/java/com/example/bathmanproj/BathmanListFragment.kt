package com.example.bathmanproj

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.bathmanproj.databinding.BathmanListFragmentBinding


class BathmanListFragment : Fragment() {
    lateinit var binding: BathmanListFragmentBinding

    companion object {
        fun newInstance() = BathmanListFragment()
    }

    private lateinit var viewModel: BathmanListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.bathman_list_fragment, container, false)

        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BathmanListViewModel::class.java)
        binding.model = this

        // TODO: Use the ViewModel
    }



}
