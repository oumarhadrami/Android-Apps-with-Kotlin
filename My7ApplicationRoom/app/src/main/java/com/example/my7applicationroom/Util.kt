package com.example.my7applicationroom

import android.content.res.Resources
import android.os.Build
import android.text.Html
import android.text.Spanned
import androidx.core.text.HtmlCompat
import com.example.my7applicationroom.database.OnePieceCharacter

fun ConvertToStrings(characters: List<OnePieceCharacter>, resources: Resources) : Spanned {
    val sb = StringBuilder()
    sb.apply {
        append(resources.getString(R.string.title))
        characters.forEach { _ ->
            append("<br>")
            append(resources.getString(R.string.name))
            append(resources.getString(R.string.devil_fruit_type))
        }
    }
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        Html.fromHtml(sb.toString(), Html.FROM_HTML_MODE_LEGACY)
    } else {
        HtmlCompat.fromHtml(sb.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}