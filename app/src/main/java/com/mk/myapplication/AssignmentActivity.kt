package com.brenda.mid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mk.myapplication.R


class AssignmentActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Account()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Account() {
    LazyColumn(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
    ){
        item {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {

                    Image(
                        imageVector = Icons.Default.Home,
                        contentDescription = "",
                    )

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = " Current location")

                        Row {
                            Image(
                                imageVector = Icons.Default.LocationOn,
                                contentDescription = "",
                                modifier = Modifier
                                    .size(15.dp)

                            )
                            Text(text = "Denpasar,Bali")
                        }

                    }

                    Image(imageVector = Icons.Default.Settings, contentDescription = "")

                }
//
                Spacer(modifier = Modifier.height(15.dp))


                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)


                    ) {
                        Image(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "",
                        )
                        Text(text = "Hotels")

                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.Cyan)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {
                        Image(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "",
                        )
                        Text(text = "Holiday")


                    }

                }



                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)


                    ) {
                        Image(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "",
                        )
                        Text(text = "Taxi")

                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {
                        Image(
                            imageVector = Icons.Default.Email,
                            contentDescription = "",
                        )
                        Text(text = "Ticket")

                    }

                }

                Spacer(modifier = Modifier.height(5.dp))

                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)


                    ) {
                        Image(
                            imageVector = Icons.Default.Home,
                            contentDescription = "",
                        )
                        Text(text = "Airplane")

                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {
                        Image(
                            imageVector = Icons.Default.Home,
                            contentDescription = "",
                        )
                        Text(text = "Harbour")



                    }

                }

                Row(
                ) {

                    Text(text = "Popular in town")

                    Spacer(modifier = Modifier.width(60.dp))
                    Text(text = "View all", color = Color.Blue)
                }


                Row(

                    modifier = Modifier
                        .padding(20.dp)
                ) {
                    Card {
                        Image(painter = painterResource(id = R.drawable.cc), contentDescription =null )
                        Text(text ="Nusa penida" , fontWeight = FontWeight.Bold)
                        Text(text = "Nusapenida,Ball", fontWeight = FontWeight.Thin)
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    Card {

                        Image(painter = painterResource(id = R.drawable.vv), contentDescription =null )
                        Text(text ="Tanah Lot" , fontWeight = FontWeight.Bold)
                        Text(text = "Tabanan,Bali", fontWeight = FontWeight.Thin)


                    }
                }
                Row(
                    modifier = Modifier
                        .padding(20.dp)



                ) {
                    Card {

                        Image(painter = painterResource(id = R.drawable.bb), contentDescription =null )
                        Text(text ="Nusa penida" , fontWeight = FontWeight.Bold)
                        Text(text = "Nusapenida,Ball", fontWeight = FontWeight.Thin)

                    }

                    Spacer(modifier = Modifier.width(20.dp))
                    Card {



                        Image(painter = painterResource(id = R.drawable.kk), contentDescription =null )
                        Text(text ="Tanah Lot" , fontWeight = FontWeight.Bold)
                        Text(text = "Tabanan,Bali", fontWeight = FontWeight.Thin)


                        AsyncImage(
                            model = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fcar%2F&psig=AOvVaw3HyrQUglr_S9VQ5InjdL-v&ust=1712306792650000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCOjK5ZCWqIUDFQAAAAAdAAAAABAE",
                            contentDescription = null,
                        )






                    }
                }
            }
        }
    }
}

@Composable
fun AsyncImage(model: String, contentDescription: Nothing?) {
    TODO("Not yet implemented")
}
