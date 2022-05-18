package com.sagrd.prestamoscompose.ui.personas

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.sagrd.prestamoscompose.ui.components.AppTextField

@Composable
fun PersonasScreen(){
    Column() {
        AppTextField(text = "", placeholder = "Nombres")

    }
}