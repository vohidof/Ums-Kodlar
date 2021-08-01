package Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.vohidov.umskodlar.R
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_home, container, false)

        root.tariffs.setOnClickListener{
            root.findNavController().navigate(R.id.tarifFragment)
        }

        root.minutes.setOnClickListener{
            root.findNavController().navigate(R.id.minutFragment)
        }

        return root
    }
}