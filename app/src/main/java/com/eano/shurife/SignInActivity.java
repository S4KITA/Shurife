package com.eano.shurife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonSignIn;
    private EditText mEditTextID, mEditTextPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        init();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mButtonSignIn:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent); // 다음화면으로 넘어가기
                finish(); // Activity 화면 제거
                break;

            default:
                break;
        }
    }

    private void init() {
        mButtonSignIn = (Button) findViewById(R.id.mButtonSignIn);
        mEditTextID = (EditText) findViewById(R.id.mEditTextID);
        mEditTextPW = (EditText) findViewById(R.id.mEditTextPW);

        mButtonSignIn.setOnClickListener(this);
    }
}