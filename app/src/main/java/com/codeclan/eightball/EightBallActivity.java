package com.codeclan.eightball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EightBallActivity extends AppCompatActivity {

    EditText questionEditText;
    Button shakeButton;
    TextView  answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_ball);
        Log.d(getClass().toString(),"onCreate called");

        questionEditText = (EditText)findViewById(R.id.question_text);
        shakeButton = (Button)findViewById(R.id.shake_button);
//        answerText = (TextView)findViewById(R.id.answer_text)
    }

    public void onShakeButtonClicked(View button){
        // initially use the log to see the button getting clicked
        Log.d(getClass().toString(), "Button was clicked!");
        String question = questionEditText.getText().toString();
        Log.d("Question asked was: ", question);

        Intent intent = new Intent(this, AnswerActivity.class);   // pass it a class as no instances yet, taken care of by Android not by developer directly
        intent.putExtra("question", question);  //passing (key, value) pair in, like a hash

        startActivity(intent);
    }
}
