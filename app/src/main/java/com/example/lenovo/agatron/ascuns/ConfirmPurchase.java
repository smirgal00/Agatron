package com.example.lenovo.agatron.ascuns;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;

import com.example.lenovo.agatron.R;

public class ConfirmPurchase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_purchase);
    }
    //if(ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED))
    public void confirm(View view) {
        WeekdaysFormatter.setTicket(true);
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage("+40727818188", null, "Z1", null, null);
        Intent i = new Intent(this, TicketHistory.class);
        startActivity(i);
        this.finish();
    }
}
