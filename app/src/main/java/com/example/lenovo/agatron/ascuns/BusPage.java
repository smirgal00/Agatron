package com.example.lenovo.agatron.ascuns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.lenovo.agatron.Harti;
import com.example.lenovo.agatron.R;


public class BusPage extends AppCompatActivity {

    int openedDropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_page);

        openedDropdown = 0;
    }

    public void onClick1(View v) {
        if (openedDropdown != 0)
            closeDropdown();

        if (openedDropdown == R.id.layout1) {
            openedDropdown = 0;
            return;
        }

        openedDropdown = R.id.layout1;
        LinearLayout ly = (LinearLayout) findViewById(openedDropdown);
        ly.setVisibility(View.VISIBLE);
    }

    public void onClick2(View v) {
        if (openedDropdown != 0)
            closeDropdown();

        if (openedDropdown == R.id.layout2) {
            openedDropdown = 0;
            return;
        }

        openedDropdown = R.id.layout2;
        LinearLayout ly = (LinearLayout) findViewById(openedDropdown);
        ly.setVisibility(View.VISIBLE);
    }

    public void onClick3(View v) {
        if (openedDropdown != 0)
            closeDropdown();

        if (openedDropdown == R.id.layout3) {
            openedDropdown = 0;
            return;
        }

        openedDropdown = R.id.layout3;
        LinearLayout ly = (LinearLayout) findViewById(openedDropdown);
        ly.setVisibility(View.VISIBLE);
    }

    public void onClick4(View v) {
        if (openedDropdown != 0)
            closeDropdown();

        if (openedDropdown == R.id.layout4) {
            openedDropdown = 0;
            return;
        }

        openedDropdown = R.id.layout4;
        LinearLayout ly = (LinearLayout) findViewById(openedDropdown);
        ly.setVisibility(View.VISIBLE);
    }

    private void closeDropdown() {
        LinearLayout ly = (LinearLayout) findViewById(openedDropdown);
        ly.setVisibility(View.GONE);
    }

    public void cp(View view) {
        Intent i = new Intent(this, ConfirmPurchase.class);
        startActivity(i);
        this.finish();
    }

    public void ruta(View v){

        Intent harta = new Intent(this, Harti.class);
        startActivity(harta);

    }
}
