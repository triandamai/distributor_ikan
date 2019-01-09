package com.distributor_ikan.auth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.distributor_ikan.R;

public class Register extends AppCompatActivity implements View.OnClickListener {
    //TODO:: halaman register
    EditText hp,password,ulangpassword;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        inisiasi_variabel();
        register.setOnClickListener(this);

    }
    //TODO ::: onclick
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_register:

                break;

        }
    }
    //TODO ::: methods
    private void inisiasi_variabel() {
        register = findViewById(R.id.btn_register);
        hp = findViewById(R.id.et_hp);
        password = findViewById(R.id.et_password);
        ulangpassword = findViewById(R.id.et_ulangpassword);
    }
}
