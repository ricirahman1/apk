package com.example.apphealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MakananSehatActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan_sehat);

        ImageView imageView = findViewById(R.id.mdaging);
        ImageView imageView1 = findViewById(R.id.back);

        imageView.setOnClickListener(this);
        imageView1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mdaging:
                startActivity(new Intent(getApplicationContext(), DagingActivity.class));
                break;
            case R.id.back:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                break;

        }

    }
}