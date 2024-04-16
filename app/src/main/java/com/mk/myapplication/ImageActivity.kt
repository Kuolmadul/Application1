package com.brenda.mid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mk.myapplication.R


class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            image()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun image() {

    Column(
        Modifier
            .background(Color.Black)
            .fillMaxSize()
            .padding(10.dp)

    )

    {
        Image(painter = painterResource(id = R.drawable.mm), contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .clip(RoundedCornerShape(30)),
            colorFilter = ColorFilter.tint(Color.Gray)
        )

        val img = LocalContext.current
        Text(text = "go to images",
            modifier = Modifier
                .clickable {
                    img.startActivity(Intent(img, ImageActivity::class.java))
                })



















    }


}




