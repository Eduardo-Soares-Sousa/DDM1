package com.user.appquiz.repository

import androidx.annotation.DrawableRes
import com.user.appquiz.R
import com.user.appquiz.model.Question

object QuestionRepository {
    val questionWithImage = listOf<Question>(
        Question(
            text = "Qual nação é essa bandeira?",
            options = listOf("Argentina", "Império do Brasil", "Bolívia", "Chile"),
            answer = 1,
            photo = R.drawable.bandeira_imperial_do_brasil
        ),

        Question(
            text = "Qual nação é essa bandeira?",
            options = listOf("Argentina", "Império do Brasil", "Bolívia", "Chile"),
            answer = 1,
            photo = R.drawable.bandeira_imperial_do_brasil
        ),

        Question(
            text = "Qual nação é essa bandeira?",
            options = listOf("Argentina", "Império do Brasil", "Bolívia", "Chile"),
            answer = 1,
            photo = R.drawable.bandeira_imperial_do_brasil
        ),

        Question(
            text = "Qual nação é essa bandeira?",
            options = listOf("Argentina", "Império do Brasil", "Bolívia", "Chile"),
            answer = 1,
            photo = R.drawable.bandeira_imperial_do_brasil
        ),

        Question(
            text = "Qual nação é essa bandeira?",
            options = listOf("Argentina", "Império do Brasil", "Bolívia", "Chile"),
            answer = 1,
            photo = R.drawable.bandeira_imperial_do_brasil
        )
    )

    val questionWithoutImage = listOf<Question>(
        Question(
            text = "Escolha a opção correta:",
            options = listOf("Essa", "Aquilo", "Todas", "Essa daqui"),
            answer = 0
        ),

        Question(
            text = "O que há de errado nesta pergunta?",
            options = listOf("Nada", "Está mal formulada", "Falta um acento", "Você leu tudo procurando um erro"),
            answer = 3
        ),

        Question(
            text = "Qual dessas palavras possui todas as letras da palavra 'QUIZ'?",
            options = listOf("ZUQI", "QUIR", "UZIQ", "ZIQA"),
            answer = 0
        ),

        Question(
            text = "O que vem depois da letra Z?",
            options = listOf("A", "Nada", "Z1", "O fim do alfabeto"),
            answer = 1
        ),

        Question(
            text = "O que acontece se você clicar na resposta certa?",
            options = listOf("Nada", "Você erra", "Você acerta", "Você fecha o app"),
            answer = 2
        ),

        Question(
            text = "Qual dessas opções vem primeiro?",
            options = listOf("Primeira", "Segunda", "Terceira", "Nenhuma"),
            answer = 0
        ),

        Question(
            text = "Quantos 'F' existem: 'Fábio foi ao farol fumar figo fresco.'",
            options = listOf("5", "6", "7", "8"),
            answer = 1
        ),

        Question(
            text = "Qual dessas é uma cor invisível?",
            options = listOf("Preto", "Branco", "Invisível", "Essa pergunta é uma pegadinha"),
            answer = 2
        ),

        Question(
            text = "Qual dessas palavras está escrita incorretamente?",
            options = listOf("Errado", "Incorretamente", "Certo", "Nenhuma das anteriores"),
            answer = 1
        ),

        Question(
            text = "Qual é o contrário de 'contrário'?",
            options = listOf("Inverso", "Igual", "Diferente", "Essa pergunta não faz sentido"),
            answer = 1
        ),

        Question(
            text = "O que é mais pesado: 1 kg de algodão ou 1 kg de chumbo?",
            options = listOf("Algodão", "Chumbo", "Os dois pesam o mesmo", "Depende da marca"),
            answer = 2
        ),

        Question(
            text = "Qual dessas palavras é a mais comprida?",
            options = listOf("Miniatura", "Gigante", "Comprida", "Essa pergunta"),
            answer = 2
        ),

        Question(
            text = "Qual dessas opções tem a letra 'Z'?",
            options = listOf("Zebra", "Cebola", "Macaco", "Nenhuma"),
            answer = 0
        ),

        Question(
            text = "Qual dessas palavras é mais parecida com 'parecida'?",
            options = listOf("Diferente", "Idêntica", "Igual", "Parecida"),
            answer = 3
        ),

        Question(
            text = "Assinale a alternativa correta:",
            options = listOf("Alternativa A", "Alternativa B", "Alternativa C", "Todas estão corretas"),
            answer = 3
        ),

        Question(
            text = "Se você tem 5 chocolates e come 2, com quantos ainda tem?",
            options = listOf("3", "5", "2", "Nenhum"),
            answer = 1
        ),

        Question(
            text = "O que é o que é: tem dentes mas não morde?",
            options = listOf("Cachorro velho", "Escova", "Avô", "Tubarão de brinquedo"),
            answer = 1
        ),

        Question(
            text = "Quantas letras tem alfabeto?",
            options = listOf("7", "8", "26", "10"),
            answer = 1
        ),

        Question(
            text = "Qual é a capital do Brasil?",
            options = listOf("Rio de Janeiro", "São Paulo", "Brasília", "Nenhuma das anteriores"),
            answer = 2
        ),

        Question(
            text = "Qual dessas palavras está fora do padrão?",
            options = listOf("Casa", "Mesa", "Banana", "Pé-de-cabra"),
            answer = 2
        )
    )

    fun generateQuestions(): List<Question> {
        val questionWithimages = questionWithImage.shuffled().take(2)
        val questionsWithoutImages = questionWithoutImage.shuffled().take(8)

        return (questionWithimages + questionsWithoutImages).shuffled()
    }
}