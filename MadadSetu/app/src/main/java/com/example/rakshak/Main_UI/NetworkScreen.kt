package com.example.rakshak.Main_UI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rakshak.R
import com.example.rakshak.ui.theme.*

@Composable
fun NetworkScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BottomNavBg) // Darker background for the Network screen
    ) {
        // Top Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
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
            Row {
                Icon(painter = painterResource(id = android.R.drawable.ic_menu_search), contentDescription = null, modifier = Modifier.size(20.dp), tint = TextSecondary)
                Spacer(modifier = Modifier.width(16.dp))
                Icon(painter = painterResource(id = android.R.drawable.ic_popup_reminder), contentDescription = null, modifier = Modifier.size(20.dp), tint = TextSecondary)
            }
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 80.dp)
        ) {
            item {
                Column(modifier = Modifier.padding(horizontal = 24.dp)) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "LIVE INTELLIGENCE FEED",
                        color = TextMuted,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.5.sp
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Active Alerts",
                        color = TextPrimary,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Row(
                            modifier = Modifier
                                .background(SurfaceIconBg, RoundedCornerShape(4.dp))
                                .padding(horizontal = 12.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(GreenBadgeText))
                            Spacer(modifier = Modifier.width(6.dp))
                            Text("LIVE NETWORK", color = TextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                        }
                        Box(
                            modifier = Modifier
                                .background(SurfaceIconBg, RoundedCornerShape(4.dp))
                                .padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Text("84 CONNECTED", color = TextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }

            item {
                AlertCard(
                    modifier = Modifier.padding(horizontal = 24.dp).padding(bottom = 16.dp),
                    categoryColor = RedButton,
                    categoryText = "URGENT BROADCAST",
                    timeText = "02 MIN AGO",
                    title = "Flash flood warning issued for Sector 7-A. Evacuate to higher ground immediately.",
                    description = "Authority: National Disaster Response Force. Status: Critical. Move towards the South-East Ridge safe zone.",
                    primaryAction = "VIEW EVACUATION ROUTE",
                    secondaryAction = "ACKNOWLEDGE"
                )
            }

            item {
                Column(modifier = Modifier.padding(horizontal = 24.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("COMMUNITY UPDATES", color = TextPrimary, fontSize = 12.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                        Icon(painter = painterResource(id = android.R.drawable.ic_menu_sort_by_size), contentDescription = null, tint = TextSecondary, modifier = Modifier.size(16.dp))
                    }
                }
            }

            item {
                UpdateCard(
                    modifier = Modifier.padding(horizontal = 24.dp).padding(bottom = 16.dp),
                    indicatorColor = GreenBadgeText,
                    categoryText = "SAFE ZONE UPDATE",
                    sourceText = "14:22 • LOCAL AUTHORITY",
                    title = "Safe zone established at Central Station",
                    description = "Medical triage and basic rations are now available on Platform 4. Entry via the main gate is clear.",
                    verifiedBy = "VERIFIED BY COMMISSIONER OFFICE"
                )
            }
            
            item {
                UpdateCard(
                    modifier = Modifier.padding(horizontal = 24.dp).padding(bottom = 16.dp),
                    indicatorColor = TextSecondary,
                    categoryText = "LOGISTICS",
                    sourceText = "13:45 • LOGISTICS HUB",
                    title = "Supplies arriving in Zone B",
                    description = "Three transport trucks carrying drinking water and blankets have reached the Zone B perimeter. Volunteer assistance required for unloading.",
                    hasImage = true
                )
            }

            item {
                UpdateCard(
                    modifier = Modifier.padding(horizontal = 24.dp).padding(bottom = 16.dp),
                    indicatorColor = GreenBadgeText,
                    categoryText = "COMMUNITY LEAD",
                    sourceText = "10:10 • VOLUNTEER CORPS",
                    title = "Satellite Link Restored",
                    description = "Connectivity has been restored for the North Hill neighborhood. Emergency calls to 112 are now functional via standard mobile networks."
                )
            }

            item {
                UpdateCard(
                    modifier = Modifier.padding(horizontal = 24.dp).padding(bottom = 16.dp),
                    indicatorColor = RedButton,
                    categoryText = "ROAD BLOCK",
                    sourceText = "09:30 • TRAFFIC CONTROL",
                    title = "Bridge Closure: Old River Route",
                    description = "Structural damage detected. The bridge is closed to all vehicular traffic until further notice. Use the Western Bypass instead."
                )
            }

            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text("LOAD ARCHIVE MESSAGES", color = TextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                }
            }
        }
    }
}

@Composable
fun AlertCard(
    modifier: Modifier = Modifier,
    categoryColor: Color,
    categoryText: String,
    timeText: String,
    title: String,
    description: String,
    primaryAction: String,
    secondaryAction: String
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = SurfaceIconBg),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Icon(Icons.Default.Warning, contentDescription = null, tint = categoryColor, modifier = Modifier.size(24.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Text(categoryText, color = categoryColor, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                Text(timeText, color = TextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Medium)
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(title, color = TextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold, lineHeight = 24.sp)
            Spacer(modifier = Modifier.height(12.dp))
            Text(description, color = TextSecondary, fontSize = 14.sp, lineHeight = 20.sp)
            Spacer(modifier = Modifier.height(24.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically) {
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = categoryColor),
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier.height(40.dp)
                ) {
                    Text(primaryAction, color = Color.White, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                }
                Text(secondaryAction, color = TextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
            }
        }
    }
}

@Composable
fun UpdateCard(
    modifier: Modifier = Modifier,
    indicatorColor: Color,
    categoryText: String,
    sourceText: String,
    title: String,
    description: String,
    verifiedBy: String? = null,
    hasImage: Boolean = false
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = DarkBackground),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        Row(modifier = Modifier.padding(16.dp).height(IntrinsicSize.Min)) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(2.dp)
                    .background(indicatorColor)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(categoryText, color = indicatorColor, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 0.5.sp)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(sourceText, color = TextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Medium)
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text(title, color = TextPrimary, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(8.dp))
                Text(description, color = TextSecondary, fontSize = 14.sp, lineHeight = 20.sp)
                
                if (verifiedBy != null) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(modifier = Modifier.size(16.dp).clip(CircleShape).background(Color.Gray))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(verifiedBy, color = TextSecondary, fontSize = 10.sp, fontWeight = FontWeight.Medium)
                    }
                }
                
                if (hasImage) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.DarkGray),
                        contentAlignment = Alignment.Center
                    ) {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Black.copy(alpha=0.6f)),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Text("VIEW SUPPLY MAP", color = TextPrimary, fontSize = 10.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                        }
                    }
                }
            }
        }
    }
}
