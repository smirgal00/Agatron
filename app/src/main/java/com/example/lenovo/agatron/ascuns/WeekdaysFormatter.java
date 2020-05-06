package com.example.lenovo.agatron.ascuns;

/**
 * Created by NewBest on 4/6/2017.
 */

public class WeekdaysFormatter {

    public static boolean isTicket() {
        return isTicket;
    }

    public static void setTicket(boolean ticket) {
        isTicket = ticket;
    }

    private static boolean isTicket=false;

    private WeekdaysFormatter() {
    }

    public static String format(String string, boolean detailed) {
        String out;

        switch (string) {
            case "lv": {
                out = detailed ? "Luni - Vineri" : "L-V";
                break;
            }
            case "ls": {
                out = detailed ? "Luni - Sambata" : "L-S";
                break;
            }
            case "ld": {
                out = detailed ? "Luni - Duminica" : "L-D";
                break;
            }
            case "l": {
                out = detailed ? "Doar Luni" : "L";
                break;
            }
            case "m": {
                out = detailed ? "Doar Marti" : "Ma";
                break;
            }
            case "x": {  //Ce plm sa fac daca si marti si miercuri incep cu m?
                out = detailed ? "Doar Mirecuri" : "Mi";
                break;
            }
            case "j": {
                out = detailed ? "Doar Joi" : "J";
                break;
            }
            case "v": {
                out = detailed ? "Doar Vineri" : "V";
                break;
            }
            case "s": {
                out = detailed ? "Doar Sambata" : "S";
                break;
            }
            case "d": {
                out = detailed ? "Doar Duminica" : "D";
                break;
            }
            // Daca mai trebuie cazuri mai punem.
            default: {
                out = "";
                break;
            }
        }
        return out;
    }
}
