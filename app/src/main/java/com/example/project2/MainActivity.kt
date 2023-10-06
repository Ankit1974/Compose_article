package com.example.project2

//import androidx.compose.ui.input.key.Key.Companion.I
//import androidx.compose.ui.tooling.data.EmptyGroup.name
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.ui.theme.Project2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticleApp()
                }
            }
        }
    }
}
@Composable
fun ComposeArticleApp() {
    GreetingText(
        message1 = stringResource(R.string.message1),
        message2 = stringResource(R.string.message2),
        message3 = stringResource(R.string.message3),
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )
}


@Composable
fun GreetingText(message1: String, imagePainter : Painter , message2:String, message3:String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier) {
             Image(painter = imagePainter, contentDescription = null)
        Text(
            text = message1,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = message2,
            modifier = Modifier
                .padding(start = 16.dp , end = 16.dp),
             textAlign = TextAlign.Justify

        )
        Text(
            text = message3,
            //textAlign = TextAlign.jus
            modifier = Modifier
                //modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify


        )
    }
}

@Preview(showBackground = true)
@Composable
fun Project2Preview() {
    Project2Theme {
        ComposeArticleApp()
    }
}