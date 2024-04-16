package com.brenda.mid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mk.myapplication.R

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            input()
        }
    }
}

fun OutlinedTextField(value: TextFieldValue, onValueChange: () -> Unit, label: Any, focusedLabelColor: Color, cursorColor: Color) {

}

fun TextField(
    value: TextFieldValue,
    onValueChange: () -> Unit,
    label: Any,
    focusedLabelColor: Color,
    cursorColor: Color
) {
    TODO("Not yet implemented")
}

fun keyboardOptions(keyboardType: KeyboardType): Any {
    TODO("Not yet implemented")
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun input() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.mm) ,
            contentDescription = "",
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }




    Column(
        Modifier
            .fillMaxSize()


    )


    {

        var name by remember {
            mutableStateOf(TextFieldValue(""))

        }
        TextField(
            value = name,
            onValueChange = {name = it},
            label = { Text(text = " name")},

            leadingIcon = { Icon(imageVector = Icons.Default.Notifications, contentDescription = "") },

            colors = TextFieldDefaults.outlinedTextFieldColors(

                unfocusedBorderColor = Color.Yellow,
                focusedLabelColor = Color.Yellow,
                cursorColor = Color.Yellow



            )
        )










        Spacer(modifier = Modifier.height(20.dp))

        var school by remember {
            mutableStateOf(TextFieldValue(""))

        }

        TextField(value = school,
            onValueChange = {school= it},

            label = { Text(text = " email address")},


            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,

                unfocusedBorderColor = Color.White,
                focusedLabelColor = Color.White,
                cursorColor = Color.White,
                unfocusedLeadingIconColor = Color.Red
            )






        )


        Spacer(modifier = Modifier.height(30.dp))


        var phone by remember {
            mutableStateOf(TextFieldValue(""))

        }
        OutlinedTextField(
            value = phone,
            onValueChange = {phone = it},
            label = { Text(text = " phone")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "") },
            textStyle = TextStyle(Color.Green),
            colors = TextFieldDefaults.outlinedTextFieldColors(

                unfocusedBorderColor = Color.Red,
                focusedLabelColor = Color.Red,
                cursorColor = Color.Red,
                unfocusedTrailingIconColor = Color.Red



            )
        )

        LazyColumn (){
            item {
                Column {

                }
            }
        }








    }

}






