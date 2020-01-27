package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myapplication.R
import com.example.myapplication.databinding.DataBinding
import com.example.primus.model.MediaMetadatum
import com.example.primus.model.Medium
import com.example.primus.model.ResultModel
import kotlinx.android.synthetic.main.item_layout.view.*

class CustomAdapter(
    private val context: Context,
    val arrylist: ArrayList<ResultModel>, val listener: ItemClickListener
) :
    RecyclerView.Adapter<CustomAdapter.CustomView>() {

    companion object {
        var mClickListener: ItemClickListener? = null
    }

    interface ItemClickListener {
        fun clickRow(position: String?)
    }

    class CustomView(val dataBinding: DataBinding) : RecyclerView.ViewHolder(dataBinding.root) {

        fun bind(resultModel: ResultModel) {
            this.dataBinding.resultmodel = resultModel
            dataBinding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomView {
        val layoutInflater = LayoutInflater.from(parent.context)
        val dataBinding: DataBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_layout, parent, false)
        return CustomView(dataBinding)

    }

    override fun getItemCount(): Int {
        return arrylist.size
    }

    override fun onBindViewHolder(holder: CustomView, position: Int) {
        val resultModel = arrylist[position]
        holder.itemView.image_view
        mClickListener = listener
        holder.itemView.setOnClickListener { view ->

            mClickListener?.clickRow(resultModel?.getAbstract())
        }

        var mediaList = ArrayList<Medium>()

        mediaList = resultModel.getMedia() as ArrayList<Medium>
        var UrlList = ArrayList<MediaMetadatum>()


        mediaList.forEachIndexed { i, element ->
            UrlList = element.getMediaMetadata() as ArrayList<MediaMetadatum>
            UrlList[0].getUrl()

            val options = RequestOptions()
            options.optionalFitCenter()
            Glide.with(holder.itemView.context)
                .load(UrlList[0].getUrl())
                .apply(options)
                .into(holder.itemView.image_view)
            holder.bind(resultModel)
        }
    }
}
