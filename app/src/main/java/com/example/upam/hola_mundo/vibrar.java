package com.example.upam.hola_mundo;

import android.content.Context;
import android.os.Vibrator;

/**
 * Created by upam on 02/02/17.
 */

public class vibrar {
    public vibrar(int time, Context ExternalVibration){
        Vibrator vib= (Vibrator) ExternalVibration.getSystemService(Context.VIBRATOR_SERVICE);
        vib.vibrate(time);
    }
}
