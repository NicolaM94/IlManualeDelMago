package base.application.ilmanualedelmago

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import base.application.ilmanualedelmago.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private val kofiuri = "https://ko-fi.com/nicolamoro20269"
    private val paypaluri = "https://paypal.me/NicolaM1994?country.x=IT&locale.x=it_IT"
    private var _binding : FragmentInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfoBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.thanksto.movementMethod = LinkMovementMethod.getInstance()
        binding.kofiButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(kofiuri))
            it.context.startActivity(intent)
        }
        binding.paypalButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(paypaluri))
            it.context.startActivity(intent)
        }



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}