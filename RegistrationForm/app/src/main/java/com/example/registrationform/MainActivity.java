package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterClick(View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText edtFirstName = findViewById(R.id.edtFirstName);
        EditText edtLastName = findViewById(R.id.edtLastName);
        EditText edtEmail = findViewById(R.id.edtEmail);

        txtFirstName.setText(edtFirstName.getText().toString());
        txtLastName.setText(edtLastName.getText().toString());
        txtEmail.setText(edtEmail.getText().toString());
    }
}