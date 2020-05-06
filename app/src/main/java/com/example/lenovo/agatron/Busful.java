package com.example.lenovo.agatron;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.io.InputStream;

import com.example.lenovo.agatron.ascuns.AutocarPage;
import com.example.lenovo.agatron.ascuns.BusPage;
import com.example.lenovo.agatron.ascuns.CityIdentifiers;
import com.example.lenovo.agatron.ascuns.Route;
import com.example.lenovo.agatron.ascuns.TicketHistory;
import com.example.lenovo.agatron.ascuns.WeekdaysFormatter;
import com.example.lenovo.agatron.Main2Activity;
import com.example.lenovo.agatron.Score;

public class Busful extends AppCompatActivity {

    private static String string = "";
    Route[] routes;
    int nrRute;
    private static final String newLine = System.getProperty("line.separator");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CityIdentifiers.initialize();
        Button caine = (Button) findViewById(R.id.curvamea);
        caine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jeg = new Intent(Busful.this, Score.class);
                startActivity(jeg);
            }
        });
        Button caine1 = (Button) findViewById(R.id.button);
        caine1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jeg = new Intent(Busful.this, BusPage.class);
                startActivity(jeg);
            }
        });
        Button caine2 = (Button) findViewById(R.id.button2);
        caine2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jeg = new Intent(Busful.this, AutocarPage.class);
                startActivity(jeg);
            }
        });
        Button caine3 = (Button) findViewById(R.id.button4);
        caine3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jeg = new Intent(Busful.this, TaxiPage.class);
                startActivity(jeg);
            }
        });
        Button caine4 = (Button) findViewById(R.id.button7);
        caine4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jeg = new Intent(Busful.this, TicketHistory.class);
                startActivity(jeg);
            }
        });

    }

    public void openActivityAutocar(View view) {
        String space = "    ";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nrRute; i++) {
            sb.append("RUTA " + (i + 1) + ": " + CityIdentifiers.getCity(routes[i].getFirstCity()) + " - " + CityIdentifiers.getCity(routes[i].getLastCity()) + newLine);
            sb.append("Itinerariu: " + newLine); // Nu stiu cat loc e, le pun pe cate o linie separata
            for (String each : routes[i].getCities())
                sb.append(CityIdentifiers.getCity(each) + " | ");

            sb.append(newLine + newLine + space + "Plecari:" + newLine);

            String[] temp = routes[i].getTimesDays();

            int j = 0;
            for (String each : routes[i].getTimes())
                sb.append(space + each + "     " + WeekdaysFormatter.format(temp[j++], false) + newLine);

            sb.append(newLine + newLine);
        }

        this.string = sb.toString();

        Intent intent = new Intent(this, AutocarPage.class);
        startActivity(intent);
    }

    public static String getString() {
        return string;
    }



}













