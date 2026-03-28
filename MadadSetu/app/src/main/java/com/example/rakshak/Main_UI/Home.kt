package com.example.rakshak.Main_UI
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rakshak.Main_UI.component.HeaderGreeting
import com.example.rakshak.Main_UI.component.SOS_button
import com.example.rakshak.ui.theme.*

@Composable
fun HomeScreen(userName: String = "Ashutosh") {
    Scaffold(
        containerColor = DarkBackground
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
        ) {
            Column(modifier = Modifier.padding(horizontal = 24.dp)) {
                Spacer(modifier = Modifier.height(24.dp))
                TopBar()
                Spacer(modifier = Modifier.height(48.dp))
                HeroSection(userName)
                Spacer(modifier = Modifier.height(48.dp))
                EmergencyButtonSection()
                Spacer(modifier = Modifier.height(48.dp))
                LocalNetworkCard()
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    SmallStatusCard(
                        title = "Stable",
                        subtitle = "FLOOD ALERT LEVEL",
                        icon = Icons.Default.Menu,
                        modifier = Modifier.weight(1f)
                    )
                    SmallStatusCard(
                        title = "Mesh",
                        subtitle = "NETWORK MODE",
                        icon = Icons.Default.Share, // Using share for network mesh concept
                        iconTint = RedButton,
                        modifier = Modifier.weight(1f)
                    )
                }
                Spacer(modifier = Modifier.height(32.dp))
                RecentActivitySection()
                Spacer(modifier = Modifier.height(32.dp))
            }
        }
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {

            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "RAKSHAK",
                color = TextPrimary,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                letterSpacing = 1.sp
            )
        }
        Icon(
            imageVector = Icons.Default.Notifications,
            contentDescription = "Notifications",
            tint = TextSecondary,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun HeroSection(userName: String = "Ashutosh") {
    HeaderGreeting(userName)
}

@Composable
fun EmergencyButtonSection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SOS_button(200,50)
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "EMERGENCY PROTOCOL READY",
            color = TextMuted,
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 2.sp
        )
    }
}

@Composable
fun LocalNetworkCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = SurfaceCard, shape = RoundedCornerShape(16.dp))
            .padding(20.dp)
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Local Network Active",
                    color = TextPrimary,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
                // Safe Zone Badge
                Row(
                    modifier = Modifier
                        .background(color = GreenBadgeBg, shape = RoundedCornerShape(16.dp))
                        .padding(horizontal = 10.dp, vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(6.dp)
                            .background(color = GreenBadgeText, shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "SAFE\nZONE",
                        color = GreenBadgeText,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 10.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Community presence within\n2.4km",
                color = TextSecondary,
                fontSize = 14.sp,
                lineHeight = 20.sp
            )
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                // Avatars Mockup
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray)
                    )
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .offset(x = (-12).dp)
                            .clip(CircleShape)
                            .background(Color.Gray)
                    )
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .offset(x = (-24).dp)
                            .clip(CircleShape)
                            .background(SurfaceIconBg),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "+12",
                            color = TextSecondary,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Column(horizontalAlignment = Alignment.End) {
                    Text(
                        text = "14",
                        color = TextPrimary,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "RESPONDERS",
                        color = TextMuted,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold,
                        letterSpacing = 1.sp
                    )
                }
            }
        }
    }
}

@Composable
fun SmallStatusCard(
    title: String,
    subtitle: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    iconTint: Color = TextSecondary,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(color = SurfaceCard, shape = RoundedCornerShape(16.dp))
            .padding(20.dp)
    ) {
        Column {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = iconTint,
                modifier = Modifier.size(28.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = title,
                color = TextPrimary,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = subtitle,
                color = TextMuted,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp
            )
        }
    }
}

@Composable
fun RecentActivitySection() {
    Column {
        Text(
            text = "RECENT ACTIVITY",
            color = TextMuted,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.5.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        ActivityItem(
            title = "Water Supplies Dispatched",
            subtitle = "Sector 4 • 12 mins ago",
            icon = Icons.Default.CheckCircle // placeholder icon
        )
        Spacer(modifier = Modifier.height(16.dp))
        ActivityItem(
            title = "Clinic Update",
            subtitle = "Central Hub • 45 mins ago",
            icon = Icons.Default.Info // placeholder icon
        )
    }
}

@Composable
fun ActivityItem(title: String, subtitle: String, icon: androidx.compose.ui.graphics.vector.ImageVector) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = SurfaceCard, shape = RoundedCornerShape(12.dp))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(color = SurfaceIconBg, shape = RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = TextSecondary,
                modifier = Modifier.size(20.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                color = TextPrimary,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = subtitle,
                color = TextSecondary,
                fontSize = 12.sp
            )
        }
        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = "Details",
            tint = TextSecondary
        )
    }
}

@Composable
fun HomeBottomNavigation() {
    NavigationBar(
        containerColor = BottomNavBg,
        tonalElevation = 0.dp
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { },
            icon = { Icon(Icons.Default.Place, contentDescription = "Status") },
            label = { Text("STATUS", fontSize = 10.sp, letterSpacing = 1.sp) },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = TextPrimary,
                selectedTextColor = TextPrimary,
                unselectedIconColor = TextSecondary,
                unselectedTextColor = TextSecondary,
                indicatorColor = SurfaceIconBg
            )
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = { Icon(Icons.Default.Person, contentDescription = "Network") }, // Group of persons not available by default, using simple person
            label = { Text("NETWORK", fontSize = 10.sp, letterSpacing = 1.sp) },
            colors = NavigationBarItemDefaults.colors(
                unselectedIconColor = TextSecondary,
                unselectedTextColor = TextSecondary
            )
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = { Icon(Icons.Default.Call, contentDescription = "SOS") },
            label = { Text("SOS", fontSize = 10.sp, letterSpacing = 1.sp) },
            colors = NavigationBarItemDefaults.colors(
                unselectedIconColor = TextSecondary,
                unselectedTextColor = TextSecondary
            )
        )
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profile") },
            label = { Text("PROFILE", fontSize = 10.sp, letterSpacing = 1.sp) },
            colors = NavigationBarItemDefaults.colors(
                unselectedIconColor = TextSecondary,
                unselectedTextColor = TextSecondary
            )
        )
    }
}

