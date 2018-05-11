package com.example.anusara.adventuremate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;

public class MainLoginActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private EditText inputEmail, inputPassword;
    private FirebaseAuth auth;
    private ProgressBar progressBar;
    private Button btnSignup, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get Firebase auth instance
        auth = FirebaseAuth.getInstance();

        if (auth.getCurrentUser() != null) {
            startActivity(new Intent(MainLoginActivity.this, HomeActivity.class));
            finish();
        }
        setContentView(R.layout.activity_main_login);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

    }

    public FirebaseAnalytics getmFirebaseAnalytics() {
        return mFirebaseAnalytics;
    }
}
