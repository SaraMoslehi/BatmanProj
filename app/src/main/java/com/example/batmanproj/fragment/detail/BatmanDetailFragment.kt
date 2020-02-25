package com.example.batmanproj.fragment.detail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.batmanproj.fragment.list.BatmanDetailViewModel
import com.example.batmanproj.R


class BatmanDetailFragment : Fragment() {

    companion object {
        fun newInstance() =
            BatmanDetailFragment()
    }

    private lateinit var viewModel: BatmanDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.batman_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BatmanDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
