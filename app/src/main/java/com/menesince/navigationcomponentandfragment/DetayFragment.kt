package com.menesince.navigationcomponentandfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
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

        // geri tuşu üzerinde işlem

        val backPress = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Snackbar.make(binding.textView2,"Geri dönmek istiyor musun?",Snackbar.LENGTH_SHORT)
                    .setAction("EVET"){
                        isEnabled = false // geri dönüş aktif
                        requireActivity().onBackPressedDispatcher.onBackPressed()
                    }
                    .show()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPress)
        return binding.root

    }
}