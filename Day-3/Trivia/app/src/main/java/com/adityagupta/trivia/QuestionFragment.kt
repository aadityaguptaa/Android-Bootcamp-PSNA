package com.adityagupta.trivia

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class QuestionFragment : Fragment() {

    var questions = listOf<String>(
        "What house is Harry Potter sorted into?",
        "What is Harry’s position on the Quidditch team?",
        "What’s the name of the three-headed dog that guards the door to the Sorcerer’s Stone?",
        "Who is the Half-Blood Prince?",
        "What wizards are trained to catch dark wizards?"
    )

    var answers = listOf<String>(
        "gryffindor",
        "seeker",
        "fluffy",
        "snape",
        "aurors"
    )

    lateinit var answerEditText: EditText
    lateinit var questionsTextView: TextView
    lateinit var submitButton: Button
    var questionNumber = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        answerEditText = view.findViewById(R.id.answerEditText)
        questionsTextView = view.findViewById(R.id.questionTextView)
        submitButton = view.findViewById(R.id.submitButton)

        questionsTextView.text = questions[0]

        submitButton.setOnClickListener {
            changeQuestion()
        }
    }

    fun changeQuestion(){
        val ans = answerEditText.text.toString()
        if(ans.toLowerCase() == answers[questionNumber]){
            questionNumber++
            if(questionNumber == questions.size){
                val intent = Intent(activity, WonActivity::class.java)
                startActivity(intent)
            }
            questionsTextView.text = questions[questionNumber]
            answerEditText.setText("")
        }else{
            val intent = Intent(activity, LostActivity::class.java)
            startActivity(intent)
        }
    }
}