package com.example.rakshak.Main_UI.Map_component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun Map_screen(){
val Starting_Point= LatLng(21.1938, 81.2869)
    val cameraPositionState = rememberCameraPositionState {
        position= CameraPosition.fromLatLngZoom(Starting_Point , 10f)
    }
    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState
    ){
        Marker(
            state = MarkerState(position = Starting_Point),
            title ="Durg",
            snippet = "Marker in Durg"
        )

    }


}