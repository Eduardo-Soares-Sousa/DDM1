package com.user.appquiz.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.user.appquiz.model.Question
import com.user.appquiz.repository.QuestionRepository

class ManageQuiz : ViewModel() {
    private var questions = QuestionRepository.generateQuestions()

    var currentQuestionIndex by mutableStateOf(0)
        private set

    var highScore by mutableStateOf(0)
        private set

    var gameStatus by mutableStateOf(GameState.IN_PROGRESS)
        private set

    fun getCurrentQuestion(): Question {
        return questions[currentQuestionIndex]
    }

    fun checkAnswer(answer: Int) {
        val currentQuestion = questions[currentQuestionIndex]

        if(answer == currentQuestion.answer) {
            highScore += 100

            if(currentQuestionIndex == questions.lastIndex) {
                gameStatus = GameState.SUCCESS
            }else {
                currentQuestionIndex++
            }
        }else {
            gameStatus = GameState.FAIL
        }
    }

    fun restart() {
        questions = QuestionRepository.generateQuestions()
        gameStatus = GameState.IN_PROGRESS
        currentQuestionIndex = 0
        highScore = 0
    }

    enum class GameState {
        IN_PROGRESS,
        FAIL,
        SUCCESS
    }
}