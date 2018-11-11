package com.example.documents.olx_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.documents.olx_project.Login.MainActivity;
import com.google.firebase.auth.FirebaseAuth;

public class Home_Activity extends AppCompatActivity {

    Button cont , logout;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        mAuth = FirebaseAuth.getInstance();
        cont = (Button) findViewById(R.id.contu);
        logout = (Button)findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent(Home_Activity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        //set on click listener ...

        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
