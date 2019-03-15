package com.example.ejercicio1_l2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText user;
    private EditText pass;
    private TextView res;
    private Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.txt_user);
        pass = findViewById(R.id.txt_pass);
        res = findViewById(R.id.txt_response);
        click = findViewById(R.id.btn_click);

        click.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                res.setText(pass.getText());
                return false;
            }
        });

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(user.getText());
            }
        });

    }

}
