package com.example.lenovo.agatron;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class TaxiPage extends AppCompatActivity{

    Random rand = new Random();
    private static final String newLine = System.getProperty("line.separator");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi_page);
    }

    public void showData(View view) {
        final EditText scrie = (EditText) findViewById(R.id.editText);



        Button b = (Button) findViewById(R.id.comanda);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = scrie.getText().toString();
                String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=Calea%20Motilor%2077,ab&destinations="+ s + ",ab&mode=walking&language=en-EN&avoid=tolls&key=AIzaSyAVCyT1BQWD6B1RvdPlQHuEsR3UBatMCTE";
                //new GeoTask(TaxiPage.class).execute(url);

            }
        });
        b.setVisibility(View.VISIBLE);

        TextView tv = (TextView) findViewById(R.id.textView11);

    }

}


