package com.example.app30days.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val PurplePrimaryLight = Color(0xFF5B3976)
private val PurplePrimaryDark = Color(0xFFD4BFEB)
private val LavenderSecondary = Color(0xFFC8A2C8)
private val LightBackground = Color(0xFFFFFFFF)
private val DarkBackground = Color(0xFF1E1E1E)

private val LightColorScheme = lightColorScheme(
    primary = PurplePrimaryLight,  // Ungu Terong
    onPrimary = Color.White,
    secondary = LavenderSecondary, // Lavender
    onSecondary = Color.Black,
    background = LightBackground,  // Background Utama
    surface = Color.White,
    surfaceVariant = Color(0xFFF0EFFF), // Warna Card background (Lavender Sangat Muda)
    onSurfaceVariant = Color.Black // Teks di atas Card
)

private val DarkColorScheme = darkColorScheme(
    primary = PurplePrimaryDark, // <<< INI YANG KITA UBAH agar lebih terang di dark mode
    onPrimary = Color.Black,     // Teks di atas primary (primary nya terang, onPrimary jadi gelap)
    secondary = LavenderSecondary,
    onSecondary = Color.White,
    background = DarkBackground,
    surface = DarkBackground,
    surfaceVariant = Color(0xFF3A3A3A), // Warna Card background gelap
    onSurfaceVariant = Color.White // <<< Juga Pastikan teks biasa di Card terlihat (Putih)
)

@Composable
fun App30DaysTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}