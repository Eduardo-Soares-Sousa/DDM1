package com.user.appquiz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CreditsScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(
            text = "Créditos",
            style = MaterialTheme.typography.headlineMedium,
            color = Color(0xFF1565C0),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = "Desenvolvido por:" +
                    "\n-Eduardo Soares de Sousa" +
                    "\n-Joana Elias de Oliveira" +
                    "\n-Victor Hugo Benetti Guilherme" +
                    "\n-Vinicus Fazolaro Silva" +
                    "\n\nDesenvolvimento Para Dispositivos Móveis - DDM1 - 2025",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onBack,
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1565C0))
        ) {
            Text("Voltar", color = Color.White)
        }
    }
}