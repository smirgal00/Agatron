package com.example.lenovo.agatron;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*Replace YOUR_API_KEY in String url with your API KEY obtained by registering your application with google.
 */
public class caut extends AppCompatActivity implements GeoTask.Geo {

    Button btn_get;
    private final static String newLine = System.getProperty("line.separator");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caut2);

        btn_get = (Button) findViewById(R.id.cumpara);


        btn_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = null;
                EditText scrie = (EditText) findViewById(R.id.editText);
                s = scrie.getText().toString();
                String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=Calea%20Motilor%2077,ab&destinations=" + s + "&mode=walking&language=en-EN&key=AIzaSyAVCyT1BQWD6B1RvdPlQHuEsR3UBatMCTE";

                new GeoTask(caut.this).execute(url);

            }
        });

    }


    public void setDouble(String result) {
        String res[]=result.split(",");
        Double min=Double.parseDouble(res[0])/60;
        Double dist=Double.parseDouble(res[1])/1000;
        TextView afis = (TextView) findViewById(R.id.textView11);
        afis.setText("Estimare:" + newLine + "Tarif: " + dist  + " RON" + newLine + "Cel mai apropiat taxi: " + min + " min.");



    }

}