package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // This is the base (Scaffold)
            Scaffold { innerPadding->
                LoginHeader(innerPadding)
                // Innerpadding le chai top ra bottom ma space dine kaam ho

                // Modifier is a decoration property
                // fillMaxSize, fillmaxheight, fillmaxwidth
                // is auto for every size of mobile phones
//                Column (
//                    modifier = Modifier
//                        .padding(innerPadding)
//                        .fillMaxSize()
//                        .background(color = Color.Red)
//                ){
//                }
            }
        }
    }
}@Composable
fun LoginHeader(innerPadding: PaddingValues) {

    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color = Color.White)
    ) {



        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){


            // Method 1
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null,

                //tint = Color.Green,
                modifier = Modifier.height(30.dp).width(30.dp),
            )

            Text(text = "Marvel Rivals",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,// Bold chai fontweight ma hunxa
                    fontStyle = FontStyle.Normal
                )
            )

            // method 2
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
                // yesari icon rakhna suru ma drawable ma jane tespaxi drawable ma lef click
                //garne ra new garyera victor asset ma jane tya gayera icon select garne
            )
        }


        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround) {
            Image(
                // Image ko namm rakhda jaile lower case ma hunu parxa
                painter = painterResource(R.drawable.img),
                contentDescription = null, contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .clip(RoundedCornerShape(50.dp))

            )
            Button(
                onClick={

                },
                shape=RoundedCornerShape(10.dp),
                colors=ButtonDefaults.buttonColors(
                    containerColor=Color.Blue,
                    contentColor=Color.Black
                )
            ) {
                Text("Follow")
            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "10")
                Text(text = "Post")
            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "18.7K")
                Text(text = "Followers")
            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "100")
                Text(text = "Following")
            }
        }


        Column(modifier = Modifier.padding(horizontal = 10.dp, vertical = 15.dp
        )) {
            Text(text = "Marvel Rivals",
                style =  TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )
            )

            Text(text = "Made in 2024",
                style =  TextStyle(
                    fontSize = 15.sp,
                )
            )


            Text(text = "Followed by Valorant, GTAV, and more",
                style =  TextStyle(
                    fontSize = 15.sp,
                )
            )


        }








    }


}





@Preview
@Composable
fun PreviewBody() {
    LoginHeader(innerPadding = PaddingValues(0.dp))
}

@Composable
fun LoginBody(){

}
@Composable
fun LoginFooter(){

}


