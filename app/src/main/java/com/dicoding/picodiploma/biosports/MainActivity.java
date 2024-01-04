package com.dicoding.picodiploma.biosports;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSports;
    private ArrayList<Sports> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSports = findViewById(R.id.rv_sports);
        rvSports.setHasFixedSize(true);

        list.addAll(SportsData.getListData());
        showRecyclerList();
    }


    private void showSelectedSports(Sports sports) {
        Intent moveIntent = new Intent(MainActivity.this, MoveDetail.class);
        moveIntent.putExtra(MoveDetail.gambar , sports.getPhotos());
        moveIntent.putExtra(MoveDetail.history , sports.getName());
        moveIntent.putExtra(MoveDetail.bio , sports.getDetail());
        startActivity(moveIntent);
    }

    private void showRecyclerList(){
        rvSports.setLayoutManager(new LinearLayoutManager(this));
        ListSportsAdapter listSportsAdapter = new ListSportsAdapter(list);
        rvSports.setAdapter(listSportsAdapter);

        listSportsAdapter.setOnItemClickCallback(new ListSportsAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Sports data) {
                showSelectedSports(data);
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_icon:
                Intent moveIntent = new Intent(MainActivity.this, MoveUser.class);
                startActivity(moveIntent);
                showRecyclerList();
                break;
        }
    }


}