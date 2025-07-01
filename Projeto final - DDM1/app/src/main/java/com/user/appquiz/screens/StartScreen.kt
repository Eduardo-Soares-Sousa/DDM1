package com.user.appquiz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun StartScreen(
    onStart: () -> Unit,
    onHowToPlay: () -> Unit,
    onCredits: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEEEEEE))
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Desafio do Quiz",
            style = MaterialTheme.typography.headlineLarge,
            color = Color(0xFF1A237E),
            modifier = Modifier.padding(bottom = 40.dp)
        )

        Button(
            onClick = onStart,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
            shape = RoundedCornerShape(50)
        ) {
            Text("Começar Quiz", style = MaterialTheme.typography.bodyLarge, color = Color.White)
        }

        Button(
            onClick = onHowToPlay,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1976D2)),
            shape = RoundedCornerShape(50)
        ) {
            Text("Como Jogar", style = MaterialTheme.typography.bodyLarge, color = Color.White)
        }

        Button(
            onClick = onCredits,
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9C27B0)),
            shape = RoundedCornerShape(50)
        ) {
            Text("Créditos", style = MaterialTheme.typography.bodyLarge, color = Color.White)
        }
    }
}
