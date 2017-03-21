package com.codeclan.eightball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();                   //retrieve parameters from intent
        String question = extras.getString("question");       // get object via key


        answerText = (TextView)findViewById(R.id.answer_text);
//        answerText.setText(question);                       // development step

        Answers answers = new Answers();                       // completing the job
        String answer = answers.getAnswer();                   // using Answers class put together yesterday
        answerText.setText(question + " The answer is " + answer);
    }
}
