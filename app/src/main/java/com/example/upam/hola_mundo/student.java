package com.example.upam.hola_mundo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by upam on 02/02/17.
 */

public class student {
    String name;
    int age;
    Context  mcontext;
    public student(Context Externalcontext){
        this.mcontext=Externalcontext;
    }


        public void  mostrart(){
            Toast.makeText(mcontext,name,Toast.LENGTH_SHORT).show();
        }

}

