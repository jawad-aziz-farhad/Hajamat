package online.hajamat.imfarhad.hajamat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import online.hajamat.imfarhad.hajamat.R;

public class Welcome extends AppCompatActivity {

    public View.OnClickListener signInListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(Welcome.this, LoginActivity.class));
            finish();
        }
    };

    private View.OnClickListener signUpListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Welcome.this, SignUp.class));
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.sign_up_button).setOnClickListener(signUpListener);
        findViewById(R.id.sign_in_button).setOnClickListener(signInListener);
    }

}
