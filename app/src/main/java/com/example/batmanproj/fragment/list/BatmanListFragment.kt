package com.example.batmanproj.fragment.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.batmanproj.R
import com.example.batmanproj.api.ApiClient
import com.example.batmanproj.databinding.BatmanListFragmentBinding
import com.example.batmanproj.db.BatmanListEntitiy


class BatmanListFragment : Fragment(){


    lateinit var binding: BatmanListFragmentBinding


    private lateinit var viewModel: BatmanListViewModel

//    private val listAdapter by lazy {
//        ListAdapter(arrayListOf(), context!!, object : ListAdapter.OnClickAdapter {
//
//            override fun onClick(position: Int, item: BatmanListEntitiy) {
//                Toast.makeText(context, "" + position, Toast.LENGTH_SHORT).show()
//            }
//        })
//    }

    private  val listAdapter = ListAdapter(arrayListOf(), context!!, object : ListAdapter.OnClickAdapter {
        override fun onClick(position: Int, item: BatmanListEntitiy) {
            TODO("Not yet implemented")
        }
    })

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.batman_list_fragment, container, false
            )

        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.model = this
        viewModel = ViewModelProviders.of(this).get(BatmanListViewModel::class.java)
//        viewModel.getBatmanList().observe(viewLifecycleOwner, Observer { })

        initRecycleView()
      
        viewModel.getBatmanList().observe(viewLifecycleOwner, Observer {

            binding.loadingView.visibility = View.GONE
            listAdapter.updateList(it)

        })

        viewModel.getBatmanlists(ApiClient.apiKey, "batman")
        // TODO: Use the ViewModel
    }


    private fun initRecycleView() {
        binding.listItem.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = listAdapter
        }
    }


}
