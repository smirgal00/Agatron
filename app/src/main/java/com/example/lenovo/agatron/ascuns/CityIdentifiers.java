package com.example.lenovo.agatron.ascuns;

import java.util.HashMap;

/**
 * Created by NewBest on 4/6/2017.
 */

public final class CityIdentifiers {
    private static HashMap<String, String> id = new HashMap<String, String>();
    private static CityIdentifiers instance;

    private CityIdentifiers() {
    }

    public static void initialize() {
        id.put("AB", "Alba Iulia");
        id.put("ST", "Santimbru"); // Alba obreja
        id.put("GL", "Galtiu"); // Alba obreja
        id.put("CL", "Coslariu"); // Alba obreja
        id.put("MH", "Mihalt"); // Alba obreja
        id.put("OB", "Obreja"); // Alba obreja
        id.put("SE", "Sebes");
        id.put("LN", "Lancram"); // Alba sebes
        id.put("OJ", "Oiejdea"); // Alba Teius
        id.put("TS", "Teius");
        id.put("AI", "Aiud"); // Nu cred ca punem rute atat de indepartate...
        id.put("BJ", "Blaj"); // Alba blaj
        id.put("CT", "Cistei"); // Alba blaj
        id.put("CR", "Craciunelu de Jos"); // Alba blaj
        id.put("ZN", "Zlatna");
        id.put("VN", "Vinerea");
        id.put("VJ", "Vintu de Jos");
        id.put("CG", "Cugir");
    }

    public static String getCity(String cod) {
        return id.get(cod);
    }

    public static boolean isID(String cod) {
        return id.containsKey(cod);
    }
}
