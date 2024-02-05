package com.lavrent.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lavrent.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview()
                }
            }
        }
    }
}

@Composable
fun CardOne() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(
                top = 340.dp,
                bottom = 100.dp,
                start = 20.dp,
                end = 20.dp
            )
    ) {
        Box(Modifier
            .padding(
                top = 10.dp,
                bottom = 10.dp,
                start = 100.dp,
                end = 100.dp
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_face_retouching_natural_black_48),
                contentDescription = null,
                Modifier
                    .size(
                        height = 120.dp,
                        width = 200.dp
                )
            )
        }
        Text(
            text = stringResource(R.string.lavrentyev_pavel),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )
        Text(
            text = stringResource(R.string.android_developer),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Green
        )
    }
}

@Composable
fun CardTwo(modifier: Modifier = Modifier) {
    Column(
        Modifier
            .padding(
                top = 10.dp,
                bottom = 20.dp,
                start = 20.dp,
                end = 20.dp
            )
    ) {
        Row(modifier.padding(10.dp)) {
            Column(
                Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                horizontalAlignment = Alignment.End
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_call_black_48),
                    contentDescription = null
                )
            }
            Column(
                Modifier.weight(2f)
            ) {
                Text(
                    text = stringResource(R.string.tel),
                    fontSize = 20.sp
                )
            }
        }
        Row(modifier.padding(10.dp)) {
            Column(
                Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                horizontalAlignment = Alignment.End
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = null
                )
            }
            Column(
                Modifier.weight(2f)
            ) {
                Text(
                    text = stringResource(R.string.https_github_com_gipnozhard),
                    fontSize = 14.sp
                )
            }
        }
        Row(modifier.padding(10.dp)) {
            Column(
                Modifier
                    .weight(1f)
                    .padding(end = 10.dp),
                horizontalAlignment = Alignment.End
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_email_black_48),
                    contentDescription = null
                )
            }
            Column(
                Modifier.weight(2f)
            ) {
                Text(
                    text = stringResource(R.string.pa_lavrentyev_gmail_com),
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(Modifier.background(Color(0xFF8F9779))) {
        CardOne()
        CardTwo(Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Greeting()
    }
}