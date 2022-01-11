package com.ashish.mygithub.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun BranchCard(branchName : String) {
    Text(text = branchName, fontWeight = FontWeight.Bold, fontSize = 24.sp)
}