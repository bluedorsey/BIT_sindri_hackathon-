package com.example.rakshak.Main_UI

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import com.example.rakshak.R
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rakshak.ui.theme.*

@Composable
fun OnboardingScreen(onNameEntered: (String) -> Unit) {
    var showDialog by remember { mutableStateOf(false) }
    var nameInput by remember { mutableStateOf("") }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            title = {
                Text(text = "Enter Your Name", fontWeight = FontWeight.Bold, color = TextPrimary)
            },
            text = {
                OutlinedTextField(
                    value = nameInput,
                    onValueChange = { nameInput = it },
                    placeholder = { Text("Name") },
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = TextPrimary,
                        unfocusedTextColor = TextPrimary,
                        cursorColor = RedButton,
                        focusedBorderColor = RedButton
                    )
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        onNameEntered(nameInput.trim().ifEmpty { "Ashutosh" })
                        showDialog = false
                    }
                ) {
                    Text("Confirm", color = RedButton, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { showDialog = false }) {
                    Text("Cancel", color = TextSecondary)
                }
            },
            containerColor = SurfaceCard
        )
    }

    Scaffold(containerColor = DarkBackground) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            // Logo
            Row(verticalAlignment = Alignment.CenterVertically) {

                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "RAKSHAK",
                    color = TextPrimary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    letterSpacing = 1.sp
                )
            }
            
            Spacer(modifier = Modifier.height(32.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(color = DarkBackground), 
                contentAlignment = Alignment.Center
            ) {
                Image(painter = painterResource(id = R.drawable.handshake), contentDescription = "Hands", modifier = Modifier.fillMaxSize())
            }
            
            Spacer(modifier = Modifier.height(48.dp))
            
            // Text Content
            Text(
                text = "You are not alone.",
                color = TextPrimary,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "RAKSHAK connects you with a\nnetwork of verified local responders\nand volunteers ready to act in an\nemergency.",
                color = TextSecondary,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                lineHeight = 24.sp
            )
            
            Spacer(modifier = Modifier.weight(1f))
            
            // Button
            Button(
                onClick = { showDialog = true },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = RedButton),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
            ) {
                Text(
                    text = "JOIN THE NETWORK",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.sp,
                    fontSize = 14.sp
                )
            }
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // Pager dots
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(modifier = Modifier.size(24.dp, 4.dp).clip(RoundedCornerShape(2.dp)).background(Color.DarkGray))
                Spacer(modifier = Modifier.width(8.dp))
                Box(modifier = Modifier.size(8.dp, 4.dp).clip(RoundedCornerShape(2.dp)).background(Color.DarkGray))
                Spacer(modifier = Modifier.width(8.dp))
                Box(modifier = Modifier.size(8.dp, 4.dp).clip(RoundedCornerShape(2.dp)).background(Color.DarkGray))
            }
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // Login Link
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Already have an account? ", color = TextSecondary, fontSize = 14.sp)
                Text(
                    text = "Login", 
                    color = RedButton, 
                    fontSize = 14.sp,
                    modifier = Modifier.clickable { /* Handle Login */ }
                )
            }
            
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}
