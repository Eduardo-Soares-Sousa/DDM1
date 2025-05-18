package com.user.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.user.app.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingCard(
                        name = "Eduardo Soares de Sousa",
                        title = "Seja Bem-Vindo",
                        phone = "+00 (00) 000 000",
                        twitter = "@socialmediahandle",
                        email = "email@doemail.com",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingCard(name: String, title: String, phone: String, twitter: String, email: String, modifier: Modifier = Modifier) {
    val emailIcon = painterResource(R.drawable.email_icon)
    Box(
        modifier = modifier.fillMaxSize().padding(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.align(Alignment.Center)
        ) {
            Image(
                painter = emailIcon,
                modifier = modifier.size(100.dp),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            Text(
                text = name,
                fontSize = 30.sp,
                lineHeight = 20.sp,
                textAlign = TextAlign.Center
            )

            Text(
                text = title,
                fontSize = 20.sp,
                lineHeight = 40.sp,
                textAlign = TextAlign.Center
            )
        }
        GreetingContact(phone = phone, twitter = twitter, email = email, modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 32.dp))
    }
}

@Composable
fun GreetingContact(phone: String, twitter: String, email: String, modifier: Modifier = Modifier) {
    val phoneIcon = painterResource(R.drawable.phone_icon)
    val twitterIcon = painterResource(R.drawable.x_twitter_icon)
    val emailIcon = painterResource(R.drawable.email_icon)
    Box(
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 4.dp)
            ) {
                Image(
                    painter = phoneIcon,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = phone,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 4.dp)
            ) {
                Image(
                    painter = twitterIcon,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = twitter,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 4.dp)
            ) {
                Image(
                    painter = emailIcon,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = email,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        GreetingCard("Eduardo Soares de Sousa", "Seja Bem-Vindo", "+00 (00) 000 000", "@socialmediahandle", "email@doemail.com")
    }
}