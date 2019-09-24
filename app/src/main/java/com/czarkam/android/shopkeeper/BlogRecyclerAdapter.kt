package com.czarkam.android.shopkeeper

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.czarkam.android.shopkeeper.models.BlogPost
import kotlinx.android.synthetic.main.card_layout.view.*
import org.w3c.dom.Text

class BlogRecyclerAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>(), Parcelable {

    private var items: List<BlogPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is BlogViewHolder ->{
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


    override fun writeToParcel(p0: Parcel?, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    constructor(parcel: Parcel) : this()

    companion object CREATOR : Parcelable.Creator<BlogRecyclerAdapter> {
        override fun createFromParcel(parcel: Parcel): BlogRecyclerAdapter {
            return BlogRecyclerAdapter(parcel)
        }

        override fun newArray(size: Int): Array<BlogRecyclerAdapter?> {
            return arrayOfNulls(size)
        }
    }

    fun submitList(blogList: List<BlogPost>){
        items = blogList
    }

    class BlogViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val blog_title: TextView = itemView.textViewTitle
        val blog_name: TextView = itemView.textViewName

        fun bind(blogPost: BlogPost) {
            blog_title.setText(blogPost.title)
            blog_name.setText(blogPost.username)
        }
    }

}