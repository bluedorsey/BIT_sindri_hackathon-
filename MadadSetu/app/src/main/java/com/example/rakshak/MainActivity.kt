package com.example.rakshak

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.*
import com.example.rakshak.Main_UI.HomeScreen
import com.example.rakshak.Main_UI.MainScreen
import com.example.rakshak.Main_UI.OnboardingScreen
import com.example.rakshak.ui.theme.RakshakTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RakshakTheme {
                var showOnboarding by remember { mutableStateOf(true) }
                var userName by remember { mutableStateOf("Ashutosh") }

                if (showOnboarding) {
                    OnboardingScreen(onNameEntered = { name ->
                        userName = name
                        showOnboarding = false
                    })
                } else {
                    MainScreen(userName = userName)
                }
            }
        }
    }
}