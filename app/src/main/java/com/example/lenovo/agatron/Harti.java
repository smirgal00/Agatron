package com.example.lenovo.agatron;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;

public class Harti extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harti);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng gara = new LatLng(46.0567, 23.575896);
        LatLng centru = new LatLng(46.0734, 23.5804);
        LatLng mall = new LatLng(46.0796, 23.5835);
        LatLng ampoi3 = new LatLng(46.0831, 23.5820);
        LatLng bazin = new LatLng(46.0799, 23.5654);
        LatLng piata = new LatLng(46.0755, 23.5594);
        LatLng dupagoldis = new LatLng(46.0657, 23.5558);
        LatLng incoronarii = new LatLng(46.0632, 23.5699);

        LatLng origins = new LatLng(46.0567, 23.575896);
        LatLng destination = new LatLng(46.0734, 23.5804);







        mMap.addPolyline(new PolylineOptions().add(

                gara,
                centru,
                mall,
                ampoi3,
                bazin,
                piata,
                dupagoldis,
                incoronarii,
                gara


                )

        );



    }






}
