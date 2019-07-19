package com.example.my8application.characters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.my8application.R
import com.example.my8application.database.OnePieceCharacter

class CharactersAdapter : ListAdapter<OnePieceCharacter,
        CharactersAdapter.ViewHolder>(CharactersDiffCallback()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)

        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }





    class ViewHolder private constructor (itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(item: OnePieceCharacter) {
            val res = itemView.context.resources

        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater
                    .inflate(R.layout.character_item, parent, false)

                return ViewHolder(view)
            }
        }

    }
}


class CharactersDiffCallback : DiffUtil.ItemCallback<OnePieceCharacter>() {
    override fun areItemsTheSame(oldItem: OnePieceCharacter, newItem: OnePieceCharacter): Boolean {
        return oldItem.characterId == newItem.characterId
    }

    override fun areContentsTheSame(oldItem: OnePieceCharacter, newItem: OnePieceCharacter): Boolean {
        return oldItem == newItem
    }
}