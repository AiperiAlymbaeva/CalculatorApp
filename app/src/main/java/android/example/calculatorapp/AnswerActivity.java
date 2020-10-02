package android.example.calculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);


        Intent intent = getIntent();
        String answer = intent.getStringExtra("answer_text");
        TextView textView = findViewById(R.id.answer_text);
        textView.setText(answer);

    }
}
