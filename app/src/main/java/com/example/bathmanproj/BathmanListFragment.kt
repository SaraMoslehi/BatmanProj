package com.example.bathmanproj

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bathmanproj.databinding.BathmanListFragmentBinding


class BathmanListFragment : Fragment() {

    lateinit var binding: BathmanListFragmentBinding

    private lateinit var viewModel: BathmanListViewModel

    private val listAdapter = ListAdapter(arrayListOf())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =
            DataBindingUtil.inflate(inflater, R.layout.bathman_list_fragment, container, false)

        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.model = this
        viewModel = ViewModelProviders.of(this).get(BathmanListViewModel::class.java)
//        viewModel.getBAthmanList().observe(viewLifecycleOwner, Observer { })

        binding.listItem.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = listAdapter
        }


        viewModel.getBathmanlists("3e974fca", "batman")
        // TODO: Use the ViewModel
    }


}
