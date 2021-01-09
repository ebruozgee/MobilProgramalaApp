package com.example.mobilprogramlamaproje

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "Bu bayrak hangi ülkeye ait?",
            R.drawable.ic_flag_of_turkey,
            "Türkiye",
            "Avustralya",
            "Arjantin",
            "Avusturya",
            1
        )

        questionsList.add(que1)
        // 2. Soru
        val que2 = Question(
            2,
            "Bu bayrak hangi ülkeye ait?",
            R.drawable.ic_flag_of_argentina,
            "Brezilya",
            "Fiji",
            "Arjantin",
            "Avusturya",
            3
        )

        questionsList.add(que2)
        // 3. Soru
        val que3 = Question(
            3,
            "Bu bayrak hangi ülkeye ait?",
            R.drawable.ic_flag_of_belgium,
            "Danimarka",
            "Belçika",
            "Brazilya",
            "Almanya",
            2
        )

        questionsList.add(que3)

        // 4. Soru
        val que4 = Question(
            4,
            "Bu bayrak hangi ülkeye ait?",
            R.drawable.ic_flag_of_fiji,
            "Kuveyt",
            "Hindistan",
            "Fiji",
            "Almanya",
            3
        )

        questionsList.add(que4)

        // 5. Soru
        val que5 = Question(
            5,
            "Bu bayrak hangi ülkeye ait?",
            R.drawable.ic_flag_of_brazil,
            "Almanya",
            "Avusturya",
            "Fiji",
            "Brezilya",
            4
        )

        questionsList.add(que5)

        // 6. Soru
        val que6 = Question(
            6,
            "Bu bayrak hangi ülkeye ait?",
            R.drawable.ic_flag_of_denmark,
            "Danimarka",
            "Almanya",
            "Turkey",
            "Hindistan",
            1
        )

        questionsList.add(que6)

        // 7. Soru
        val que7 = Question(
            7,
            "Bu bayrak hangi ülkeye ait?",
            R.drawable.ic_flag_of_germany,
            "Belçika",
            "Almanya",
            "Yeni Zelanda",
            "Hindistan",
            2
        )

        questionsList.add(que7)

        // 8. Soru
        val que8 = Question(
            8,
            "Bu bayrak hangi ülkeye ait?",
            R.drawable.ic_flag_of_kuwait,
            "Belçika",
            "Kuveyt",
            "Yeni Zelanda",
            "Danimarka",
            2
        )

        questionsList.add(que8)

        // 9. Soru
        val que9 = Question(
            9,
            "Bu bayrak hangi ülkeye ait?",
            R.drawable.ic_flag_of_new_zealand,
            "Fiji",
            "Hindistan",
            "Kuveyt",
            "Yeni Zelanda",
            4
        )

        questionsList.add(que9)

        // 10. Soru
        val que10 = Question(
            10,
            "Bu bayrak hangi ülkeye ait?",
            R.drawable.ic_flag_of_india,
            "Fiji",
            "Hindistan",
            "Brazilya",
            "Almanya",
            2
        )

        questionsList.add(que10)
        return questionsList
    }
}