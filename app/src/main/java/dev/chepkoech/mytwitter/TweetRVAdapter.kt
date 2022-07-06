package dev.chepkoech.mytwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRVAdapter(var tweetList:List<Tweet>):
    RecyclerView.Adapter<TweetsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_item,parent,false)
        return TweetsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var currentTweet = tweetList.get(position)
        holder.tvTweet.text = currentTweet.tweet
        holder.tvHandle.text = currentTweet.handle
        holder.tvName.text = currentTweet.name


    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}
class TweetsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet= itemView.findViewById<TextView>(R.id.tvTweet)
    var imgComment= itemView.findViewById<ImageView>(R.id.imgComment)
    var imgRetweet= itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgAvatar= itemView.findViewById<ImageView>(R.id.imgAvatar)
    var imgLike= itemView.findViewById<ImageView>(R.id.imgLike)
    var imgShare= itemView.findViewById<ImageView>(R.id.imgShare)

}
