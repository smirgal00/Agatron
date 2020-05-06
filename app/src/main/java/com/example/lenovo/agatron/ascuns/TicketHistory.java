package com.example.lenovo.agatron.ascuns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.lenovo.agatron.R;

public class TicketHistory extends AppCompatActivity {

    private static final String newLine = System.getProperty("line.separator");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_history);

        TextView tv = (TextView) findViewById(R.id.textView13);
        if(WeekdaysFormatter.isTicket())
            tv.setText("BILET ACTIV" + newLine + "ZONA 1" + newLine + "Timp Ramas: 1 ora");
    }
}
