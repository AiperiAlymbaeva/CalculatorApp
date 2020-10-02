package android.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    float value1 = 0;
    float value2 = 0;
    float result = 0;

    private EditText mE1;
    private EditText mE2;
    private Button mB1;
    private Button mB2;
    private Button mB3;
    private Button mB4;
    private Button mB5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mE1 = (EditText) findViewById(R.id.num1);
        mE2 = (EditText) findViewById(R.id.num2);
        mB1 = (Button) findViewById(R.id.plus);
        mB2 = (Button) findViewById(R.id.minus);
        mB3 = (Button) findViewById(R.id.multiply);
        mB4 = (Button) findViewById(R.id.divide);


        mB1.setOnClickListener(this);
        mB2.setOnClickListener(this);
        mB3.setOnClickListener(this);
        mB4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        value1 = 0;
        value2 = 0;


        if (TextUtils.isEmpty(mE1.getText().toString()) || TextUtils.isEmpty(mE2.getText().toString())) {
            return;
        }

        value1 = Float.parseFloat(mE1.getText().toString());
        value2 = Float.parseFloat(mE2.getText().toString());


        switch (v.getId()) {
            case R.id.plus:
                result = value1 + value2;
                break;
            case R.id.minus:
                result = value1 - value2;
                break;
            case R.id.multiply:
                result = value1 * value2;
                break;
            case R.id.divide:
                result = value1 / value2;
                break;
            default:
                break;

        }
    }


    public void movePage(View view) {
        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer_text", Float.toString(result));
        startActivity(intent);
    }


}