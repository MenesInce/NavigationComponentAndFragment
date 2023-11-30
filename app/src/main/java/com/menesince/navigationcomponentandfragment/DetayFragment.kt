package com.menesince.navigationcomponentandfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.menesince.navigationcomponentandfragment.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle : DetayFragmentArgs by navArgs()
        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val medeniDurum = bundle.bekarMi

        val urunId = bundle.urun.id
        val urunAd = bundle.urun.ad

        binding.textView2.text = "$gelenAd - $gelenYas - $gelenBoy - $medeniDurum - $urunId - $urunAd"





        return binding.root

    }
}