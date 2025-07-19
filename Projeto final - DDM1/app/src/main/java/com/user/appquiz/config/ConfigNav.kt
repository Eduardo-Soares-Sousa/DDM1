package com.user.appquiz.config

import androidx.compose.runtime.Composable
import com.user.appquiz.screens.CreditsScreen
import com.user.appquiz.screens.FailScreen
import com.user.appquiz.screens.HowToPlayScreen
import com.user.appquiz.Controller.ManageQuiz
import com.user.appquiz.screens.QuestionScreen
import com.user.appquiz.screens.StartScreen
import com.user.appquiz.screens.SuccessScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ConfigNav() {
    val navController = rememberNavController()
    val quizViewModel: ManageQuiz = viewModel()

    NavHost(navController = navController, startDestination = "start") {
        composable("start") {
            StartScreen(
                onStart = {
                    quizViewModel.restart()
                    navController.navigate("quiz")
                },
                onHowToPlay = { navController.navigate("howto") },
                onCredits = { navController.navigate("credits") }
            )
        }

        composable("quiz") {
            QuestionScreen(
                viewModel = quizViewModel,
                onFail = { navController.navigate("fail") },
                onSuccess = { navController.navigate("success") }
            )
        }

        composable("fail") {
            FailScreen(
                onRestart = { navController.navigate("start") }
            )
        }

        composable("success") {
            SuccessScreen(
                score = quizViewModel.highScore,
                onRestart = { navController.navigate("start") }
            )
        }

        composable("howto") {
            HowToPlayScreen(
                onBack = { navController.navigate("start") }
            )
        }

        composable("credits") {
            CreditsScreen(
                onBack = { navController.navigate("start") }
            )
        }
    }
}