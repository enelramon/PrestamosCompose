package com.sagrd.prestamoscompose.ui.ocupaciones

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sagrd.prestamoscompose.ui.components.AppTextField

@Composable
fun OcupacionesScreen(){
    Column() {
        AppTextField(text = "", placeholder = "Descripción")
        Spacer(modifier = Modifier.padding(vertical = 4.dp))
        AppTextField(text = "", placeholder = "Salario")
        Spacer(modifier = Modifier.padding(vertical = 4.dp))
        Row(Modifier.align(Alignment.CenterHorizontally)) {

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Guardar")
            }
        }
    }
}