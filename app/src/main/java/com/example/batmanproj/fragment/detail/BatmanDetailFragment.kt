package com.example.batmanproj.fragment.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.batmanproj.R
import com.example.batmanproj.api.ApiClient
import com.example.batmanproj.databinding.BatmanDetailFragmentBinding


class BatmanDetailFragment : Fragment() {

    lateinit var binding: BatmanDetailFragmentBinding

    private lateinit var viewModel: BatmanDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =
            DataBindingUtil.inflate(inflater, R.layout.batman_detail_fragment, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.model = this

        viewModel = ViewModelProviders.of(this).get(BatmanDetailViewModel::class.java)

        viewModel.getBatmanDetail(ApiClient.apiKey, "")
    }

}
