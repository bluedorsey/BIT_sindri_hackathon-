package com.example.rakshak.Main_UI

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Layers
import androidx.compose.material.icons.filled.MyLocation
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rakshak.R
import com.example.rakshak.ui.theme.*

@Composable
fun StatusScreen(userName: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBackground)
    ) {
        // Fake Map grid background to simulate Map
        Box(
            modifier = Modifier
                .fillMaxSize()
                .drawBehind {
                    val gridSize = 100f
                    val strokeW = 1f
                    val gridColor = Color.LightGray.copy(alpha = 0.1f)
                    
                    var x = 0f
                    while(x < size.width) {
                        drawLine(color = gridColor, start = Offset(x, 0f), end = Offset(x, size.height), strokeWidth = strokeW)
                        x += gridSize
                    }
                    var y = 0f
                    while(y < size.height) {
                        drawLine(color = gridColor, start = Offset(0f, y), end = Offset(size.width, y), strokeWidth = strokeW)
                        y += gridSize
                    }
                }
        )

        // Contents Over Map
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // Top Bar
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(BottomNavBg)
                    .padding(horizontal = 24.dp, vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null, modifier = Modifier.size(24.dp), tint = RedButton)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "RAKSHAK",
                        color = TextPrimary,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        letterSpacing = 1.sp
                    )
                }
                Text(
                    text = "Stay calm. We are connected.",
                    color = TextSecondary,
                    fontSize = 12.sp
                )
            }

            // Sub Header
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(DarkBackground.copy(alpha=0.9f))
                    .padding(horizontal = 24.dp, vertical = 12.dp)
            ) {
                Text(
                    text = "LIVE CONNECTION: STABLE",
                    color = TextMuted,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.5.sp
                )
            }

            Box(modifier = Modifier.fillMaxSize()) {
                // Map elements
                // Floating status card
                Card(
                    colors = CardDefaults.cardColors(containerColor = SurfaceIconBg),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(0.7f)
                        .align(Alignment.TopStart)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(modifier = Modifier
                                .size(8.dp)
                                .clip(CircleShape)
                                .background(GreenBadgeText))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("AREA SECURED", color = TextPrimary, fontWeight = FontWeight.Bold, fontSize = 14.sp)
                        }
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            "3 Responders active in your 500m radius. Stay at your current coordinates.",
                            color = TextSecondary,
                            fontSize = 12.sp,
                            lineHeight = 18.sp
                        )
                    }
                }

                // Map Side buttons
                Column(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(SurfaceIconBg)
                            .clickable { },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Default.Layers, contentDescription = null, tint = TextSecondary)
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(SurfaceIconBg)
                            .clickable { },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Default.MyLocation, contentDescription = null, tint = TextSecondary)
                    }
                }

                // Fake Markers
                MapMarker("MEDICAL UNIT", GreenBadgeBg, GreenBadgeText, Modifier.align(Alignment.TopEnd).offset(x = (-40).dp, y = 140.dp))
                MapMarker("HELPER • 200M", GreenBadgeBg, GreenBadgeText, Modifier.align(Alignment.Center).offset(x = (-40).dp, y = (-70).dp))
                
                // You marker
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.align(Alignment.Center)
                ) {
                    Box(modifier = Modifier
                        .size(16.dp)
                        .clip(CircleShape)
                        .background(Color.White))
                    Spacer(modifier = Modifier.height(4.dp))
                    Box(modifier = Modifier
                        .background(Color.Black.copy(alpha=0.6f), RoundedCornerShape(4.dp))
                        .padding(horizontal=8.dp, vertical=4.dp)) {
                        Text("YOU", color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
                
                MapMarker("COMMUNITY RESPONDER", GreenBadgeBg, GreenBadgeText, Modifier.align(Alignment.BottomEnd).offset(x = (-40).dp, y = (-270).dp))

                // Bottom Assist Requested Sheet
                BottomSheetAssist(Modifier.align(Alignment.BottomCenter))
            }
        }
    }
}

@Composable
fun MapMarker(text: String, bgColor: Color, textColor: Color, modifier: Modifier) {
    Row(
        modifier = modifier
            .background(Color.Black.copy(alpha=0.6f), RoundedCornerShape(4.dp))
            .padding(horizontal=6.dp, vertical=4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier
            .size(6.dp)
            .clip(CircleShape)
            .background(textColor))
        Spacer(modifier = Modifier.width(6.dp))
        Text(text, color = textColor, fontSize = 9.sp, fontWeight = FontWeight.Bold, letterSpacing = 0.5.sp)
    }
}

@Composable
fun BottomSheetAssist(modifier: Modifier) {
    Card(
        colors = CardDefaults.cardColors(containerColor = SurfaceIconBg),
        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp, bottomStart = 16.dp, bottomEnd = 16.dp),
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(24.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(RedButton),
                    contentAlignment = Alignment.Center
                ) {
                    Text("*", color = Color.Black, fontSize = 32.sp, fontWeight = FontWeight.Bold, modifier = Modifier.offset(y = 4.dp))
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text("Assistance Requested", color = TextPrimary, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Aarav and 2 others are moving towards you.", color = TextSecondary, fontSize = 14.sp)
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Button(
                    onClick = { /* Cancel */ },
                    colors = ButtonDefaults.buttonColors(containerColor = DarkBackground),
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text("CANCEL", color = TextPrimary, fontWeight = FontWeight.Bold, letterSpacing = 1.sp, fontSize = 12.sp)
                }
                Button(
                    onClick = { /* Safe */ },
                    colors = ButtonDefaults.buttonColors(containerColor = RedButton),
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text("I AM SAFE", color = Color.White, fontWeight = FontWeight.Bold, letterSpacing = 1.sp, fontSize = 12.sp)
                }
            }
        }
    }
}
