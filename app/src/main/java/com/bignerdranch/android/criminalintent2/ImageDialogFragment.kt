package com.bignerdranch.android.criminalintent2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import getScaledBitmap
import kotlinx.android.synthetic.main.image_fragment.view.*

private const val ARG_IMAGE = "image"


class ImageDialogFragment : DialogFragment() {

    private lateinit var patchImage: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val patch  = arguments?.getSerializable(ARG_IMAGE) as String
        patchImage = patch
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var rootView : View =  inflater.inflate(R.layout.image_fragment, container, false)

        val bitmap = getScaledBitmap(patchImage, requireActivity())
        rootView.imageView.setImageBitmap(bitmap)

       // rootView.button2.setOnClickListener {

         //   rootView.button2.setText(patchImage)
       // }




        return rootView
    }



    companion object {
        fun newInstance(patch: String): ImageDialogFragment {
            val args = Bundle().apply {
                putSerializable(ARG_IMAGE, patch)
            }
            return  ImageDialogFragment().apply {
                arguments = args
            }
        }
    }


}