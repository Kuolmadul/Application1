package com.madul.brenda

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.brenda.mid.ImageActivity
import com.mk.myapplication.R


class AboutActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            About()

        }
    }
}


@SuppressLint("SuspiciousIndentation")
@Preview(showBackground = true)
@Composable

fun About() {
    Column(

        Modifier
            .background(Color.Cyan)
//        .fillMaxWidth()
//        .fillMaxHeight()
            .fillMaxSize(),


//    verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    )
    {
        Text(text = "ABOUT SCREEN")
        val home = LocalContext.current
        Button(onClick = { }) {
            home.startActivity(Intent(home,AboutActivity2::class.java))
            Text(text = "HOME PAGE")


            Image(painter = painterResource(id = R.drawable.mm), contentDescription = "null")
        }




        Row {
            Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .padding(10.dp)
            Text(text = "Home")
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "About")
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "services")


        }
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "android",color = Color.Yellow,modifier = Modifier.background(Color.Red))
        Text(text = "development",color = Color.Red)
        val about = LocalContext.current
        Button(
            onClick = {
                about.startActivity(Intent(about, AboutActivity2::class.java))


            },

            colors=ButtonDefaults.buttonColors(Color.Transparent),
//    shape = RectangleShape
//    shape = RoundedCornerShape(20.dp)    ,
            shape = CutCornerShape(10.dp),
            border = BorderStroke(1.dp, Color.DarkGray )

        ) {

            Text(text = "HOME SCREEN", color = Color.DarkGray)
            val img = LocalContext.current
            Text(text = "go to images",
                modifier =Modifier
                    .clickable {
                        img.startActivity(Intent(img,ImageActivity::class.java))
                    }
            )

        }
        Spacer(modifier = Modifier.height(30.dp))
        val kk = AnnotatedString("click here to go home", spanStyle = SpanStyle(Color.Blue))
        val hh = LocalContext.current
        ClickableText(text = kk, onClick= {
            hh.startActivity(Intent(hh,MainActivity::class.java))

        }
        )
        val ss = LocalContext.current
        Text(text = "click here",
            modifier = Modifier
                .clickable {
                    ss.startActivity(Intent(ss,MainActivity::class.java))
                })
    }

}







