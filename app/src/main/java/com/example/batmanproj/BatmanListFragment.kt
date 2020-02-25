package com.example.batmanproj

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.batmanproj.databinding.BatmanListFragmentBinding


class BatmanListFragment : Fragment() {

    lateinit var binding: BatmanListFragmentBinding

    private lateinit var viewModel: BatmanListViewModel

    private val listAdapter = ListAdapter(arrayListOf())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =
            DataBindingUtil.inflate(inflater, R.layout.batman_list_fragment, container, false)

        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.model = this
        viewModel = ViewModelProviders.of(this).get(BatmanListViewModel::class.java)
//        viewModel.getBatmanList().observe(viewLifecycleOwner, Observer { })

        binding.listItem.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = listAdapter
        }


        viewModel.getBatmanlists("3e974fca", "batman")
        // TODO: Use the ViewModel
    }


}
