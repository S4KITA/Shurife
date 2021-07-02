package com.eano.shurife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                if (mEditTextID.getText().length() == 0) {
                    Toast.makeText(this, "익명의 사용자님 어서오세요.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, mEditTextID.getText()+"님 어서오세요.", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
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