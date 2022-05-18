package com.sagrd.prestamoscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sagrd.prestamoscompose.ui.ocupaciones.OcupacionesScreen
import com.sagrd.prestamoscompose.ui.theme.PrestamosComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrestamosComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    OcupacionesScreen()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PrestamosComposeTheme {
        Ocupacion()
    }
}

@Composable
fun Ocupacion(){
    TextField(
        value = "",
        onValueChange = {
            //viewModel.onEvent(RegistrationFormEvent.EmailChanged(it))
        },
        isError =false,// state.emailError != null,
        modifier = Modifier.fillMaxWidth(),
        placeholder = {
            Text(text = "Descripción")
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email
        )
    )
    /*if (state.emailError != null) {
        Text(
            text = "",//state.emailError,
            color = MaterialTheme.colors.error,
            modifier = Modifier.align(Alignment.End)
        )
    }*/
    Spacer(modifier = Modifier.height(16.dp))


}