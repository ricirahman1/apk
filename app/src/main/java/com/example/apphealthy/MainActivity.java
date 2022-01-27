package com.example.apphealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView1 = findViewById(R.id.iolahraga);
        ImageView imageView2 = findViewById(R.id.imakanansehat);
        ImageView imageView3 = findViewById(R.id.ipolamakan);
        ImageView imageView4 = findViewById(R.id.imanajementwaktu);
        ImageView imageView5 = findViewById(R.id.profil);
        ImageView imageView6 = findViewById(R.id.dayam);



        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);

    }
    public void logout1(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iolahraga:
                startActivity(new Intent(getApplicationContext(),OlahragaActivity.class));
                break;
            case R.id.imakanansehat:
                startActivity(new Intent(getApplicationContext(),MakananSehatActivity.class));
                break;
            case R.id.ipolamakan:
                startActivity(new Intent(getApplicationContext(),PolaMakanActivity.class));
                break;
            case R.id.imanajementwaktu:
                startActivity(new Intent(getApplicationContext(),ManajemeWaktuActivity.class));
                break;
            case R.id.profil:
                startActivity(new Intent(getApplicationContext(),ProfilActivity.class));
                break;
            case R.id.dayam:
                startActivity(new Intent(getApplicationContext(),DagingActivity.class));
                break;

        }
    }
}