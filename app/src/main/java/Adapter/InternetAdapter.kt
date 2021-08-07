package Adapter

import Model.InternetModel
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.vohidov.umskodlar.R
import kotlinx.android.synthetic.main.item_paket.view.*

class InternetAdapter (var context: Context, var list: ArrayList<InternetModel>, var itemClick: ItemClick) :
    RecyclerView.Adapter<InternetAdapter.MyViewHolder>() {

    inner class MyViewHolder(var itemview: View) : RecyclerView.ViewHolder(itemview) {
        fun onBind(model: InternetModel, position: Int) {
            itemview.txt_mb.text = list[position].mb
            itemview.txt_mbNarxi.text = list[position].narxi
            itemview.txt_mbMuddati.text = list[position].muddati

            itemview.setOnClickListener {
                itemClick.onClick(list, position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_paket, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
interface ItemClick{
    fun onClick(list: ArrayList<InternetModel>, position: Int)
}