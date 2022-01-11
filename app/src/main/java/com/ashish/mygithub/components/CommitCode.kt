package com.ashish.mygithub.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun CommitCode(text: String, modifier: Modifier = Modifier) {

    Surface(
        color = MaterialTheme.colors.background.copy(
            alpha = if (MaterialTheme.colors.isLight) 0.7f else 1f
        ),
        contentColor = MaterialTheme.colors.surface,
        shape = RoundedCornerShape(20),
        border = BorderStroke(
            width = 1.dp,
            color = MaterialTheme.colors.surface

        )
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.subtitle2,
            modifier = Modifier.padding(
                vertical = 6.dp,
                horizontal = 8.dp,
            )
        )
    }
}
