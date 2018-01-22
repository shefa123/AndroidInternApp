package com.shefali.assignmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //Declare widgets
    EditText username = null;
    EditText password = null;
    ImageButton login = null;

    CustomTextView register = null;
    CustomTextView help = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //hide statusbar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //innitialize widgets
        username = (EditText) findViewById(R.id.edt_username);
        password = (EditText) findViewById(R.id.edt_password);

        register = (CustomTextView) findViewById(R.id.register);
        help = (CustomTextView) findViewById(R.id.help);

        login = (ImageButton) findViewById(R.id.login);

        //Set onClickListeners
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginNow();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, R.string.reg_click,
                        Toast.LENGTH_SHORT).show();
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, R.string.help_click,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void loginNow() {
        String str_username = username.getText().toString();
        String str_password = password.getText().toString();

        if(str_username.isEmpty() || str_password.isEmpty())
        {
            Toast.makeText(this, R.string.warning_msg1,
                    Toast.LENGTH_SHORT).show();
        }else{
            if(str_username.equals("user") && str_password.equals("123"))
            {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(this, R.string.login_failed,
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}
