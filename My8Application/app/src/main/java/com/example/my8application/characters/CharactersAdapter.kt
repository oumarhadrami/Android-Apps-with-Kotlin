package com.example.my8application.characters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.my8application.database.OnePieceCharacter
import com.example.my8application.databinding.CharacterItemBinding

class CharactersAdapter : ListAdapter<OnePieceCharacter,
        CharactersAdapter.ViewHolder>(CharactersDiffCallback()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)

        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }





    class ViewHolder private constructor (val binding: CharacterItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(item: OnePieceCharacter) {
            binding.character = item
            binding.executePendingBindings()

        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = CharacterItemBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
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