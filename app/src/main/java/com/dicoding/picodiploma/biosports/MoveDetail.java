package com.dicoding.picodiploma.biosports;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MoveDetail extends AppCompatActivity implements View.OnClickListener{

    private ImageView imageView;
    public static final String gambar = "test";
    public static final String history = "tes";
    public static final String bio = "tester";
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_detail);

        ImageView img = findViewById(R.id.gambar);
        TextView nama = findViewById(R.id.nama);
        TextView sinopsis = findViewById(R.id.sinopsis);
        imageView = findViewById(R.id.btn_stars);

        int image = getIntent().getIntExtra(gambar, 0);
        String sjrh = getIntent().getStringExtra(history);
        String Bio = getIntent().getStringExtra(bio);

        Glide.with(this)
                .load(image)
                .apply(new RequestOptions().override(1000, 1000))
                .into(img);

        nama.setText(sjrh);
        sinopsis.setText(Bio);

        imageView.setOnClickListener(this);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_stars) {
            String sjrh = getIntent().getStringExtra(history);
            Toast.makeText(this, sjrh + " added to your favorite list", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}