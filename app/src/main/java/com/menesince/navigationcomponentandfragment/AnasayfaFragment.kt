package com.menesince.navigationcomponentandfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.menesince.navigationcomponentandfragment.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonDetay.setOnClickListener {

            val urun = Urunler(100,"Tv")
            val gecis = AnasayfaFragmentDirections.detayGecis(urun = urun, ad = "Ahmet", yas = 23, boy = 1.88f, bekarMi = true)

            Navigation.findNavController(it).navigate(gecis)
        }


        return binding.root

    }
}