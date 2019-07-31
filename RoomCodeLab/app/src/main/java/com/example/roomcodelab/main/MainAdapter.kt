package com.example.roomcodelab.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.roomcodelab.database.GoldenJojo
import com.example.roomcodelab.databinding.GoldenJojoCardBinding

class CharactersAdapter(val clickListener : GoldenJojoCharacterListener) : ListAdapter<GoldenJojo,
        CharactersAdapter.ViewHolder>(CharactersDiffCallback()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), clickListener)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }





    class ViewHolder private constructor (val binding: GoldenJojoCardBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(
            item: GoldenJojo,
            clickListener: GoldenJojoCharacterListener) {

            binding.character = item
            binding.clickListener = clickListener
            binding.executePendingBindings()

        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = GoldenJojoCardBinding.inflate(layoutInflater, parent, false)

                return ViewHolder(binding)
            }
        }

    }
}


class CharactersDiffCallback : DiffUtil.ItemCallback<GoldenJojo>() {
    override fun areItemsTheSame(oldItem: GoldenJojo, newItem: GoldenJojo): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: GoldenJojo, newItem: GoldenJojo): Boolean {
        return oldItem == newItem
    }
}


class GoldenJojoCharacterListener(val clickListener: (characterId : Long) -> Unit){
    fun onClick(character : GoldenJojo) = clickListener(character.id)
}