package com.example.rakshak.Main_UI.component

import android.widget.Button
import androidx.annotation.Size
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rakshak.Main_UI.HomeScreen
import com.example.rakshak.ui.theme.GreenBadgeBg
import com.example.rakshak.ui.theme.GreenBadgeText
import com.example.rakshak.ui.theme.RedButton

@Composable
fun SOS_button(size: Int,textsize : Int){
    val redGradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFF8B0000), // Dark Red
            Color(0xFFFF5252)  // Bright/Light Red
        )
    )
    Button(
        onClick = { /*TODO*/ },
        shape = CircleShape,
        modifier = Modifier
            .padding(16.dp)
            .size(size.dp)
            .background(brush = redGradient, shape = CircleShape)
        , colors = ButtonDefaults.buttonColors(containerColor = RedButton)

    ){
Text(text = "SOS", fontWeight = FontWeight.Bold, fontSize = textsize.sp)
    }
}

@Composable
fun HeaderGreeting(userName: String = "Ashutosh") {
    Column(modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)) {
        Text(
            buildAnnotatedString {
                append("$userName \n")
                withStyle(style = SpanStyle(color = GreenBadgeText)) {
                    append("Stay calm")
                }
                append("\nWe are connected.")
            },
            style = MaterialTheme.typography.displayLarge,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Your community is active and standing by",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
//