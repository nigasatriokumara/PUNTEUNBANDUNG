package com.example.punteunbandung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginAdminActivity extends AppCompatActivity {
    EditText editText_username ,getEditText_password;
    String text1 ,text2;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page_admin);

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), RegisterActivty.class);
                startActivity(i);
            }
        });
    }
    public void button3 (View View){
        editText_username = (EditText)findViewById(R.id.editText);
        getEditText_password = (EditText)findViewById(R.id.editText2);
        text1 = editText_username.getText().toString();
        text2 = getEditText_password.getText().toString();

            if ((text1.contains("Username"))&&((text2.contains("Password")))) {
                Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginAdminActivity.this, RegisterActivty.class);
                startActivity(intent);
        }

        else if ((text1.matches("") || text2.matches("")))

        {
            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show();

        }
        else   {
            Toast.makeText(this, "Login Gagal / Username Password Salah", Toast.LENGTH_SHORT).show();
        }
    }
}
