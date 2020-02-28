package com.example.batmanproj.fragment.list

import android.opengl.Visibility
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.batmanproj.R
import com.example.batmanproj.api.ApiClient
import com.example.batmanproj.databinding.BatmanListFragmentBinding
import com.example.batmanproj.db.MovieEntity


class BatmanListFragment : Fragment() {

    lateinit var binding: BatmanListFragmentBinding

    private lateinit var viewModel: BatmanListViewModel

    private val listAdapter by lazy {
        ListAdapter(arrayListOf(), context!!, object : ListAdapter.OnClickAdapter {
            override fun onClick(position: Int,itemBinding :MovieEntity) {
                Toast.makeText(context ,""  +position , Toast.LENGTH_SHORT).show()



            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.batman_list_fragment, container, false)
        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.model = this
        viewModel = ViewModelProviders.of(this).get(BatmanListViewModel::class.java)
//        viewModel.getBatmanList().observe(viewLifecycleOwner, Observer { })

        initRecyclerView()



        viewModel.getAllMovie().observe(viewLifecycleOwner, Observer {

            binding.loadingView.visibility = View.GONE
            listAdapter.update(it)

        })

        viewModel.getBatmanlists(ApiClient.apiKey, "batman")
        // TODO: Use the ViewModel
    }

    private fun initRecyclerView() {

        binding.listItem.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = listAdapter
        }


    }


}
