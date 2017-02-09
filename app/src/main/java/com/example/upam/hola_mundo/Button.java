package com.example.upam.hola_mundo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Button extends AppCompatActivity { // clase abstracta
  int t=0;
    EditText name;
   String tag="info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        //name =(EditText) findViewById(R.id.texto);
        //student al = new student(this);
        //al.name="chuky";
        //al.mostrart();

        SharedPreferences pref= getSharedPreferences("Data_student",Context.MODE_PRIVATE);
    }

    public void button(View v){
        t=3000;
        vibrar vr= new vibrar(t,this);


    }
    public void button2(View v){
        t=2000;
        vibrar vr=new vibrar(t,this);

    }

    public void llamada_dos(View v){

        Vibrator vib= (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vib.vibrate(1000);
        Intent i= new Intent(this,Segundo.class);
        i.putExtra("name",name.getText().toString());
        startActivity(i);


    }


  /*  class student{//clase interna
        String name;
        int age;
        public void  mostrart(){
            Toast.makeText(Button.this, name,Toast.LENGTH_SHORT).show();
        }
    }


    /*public void click_hola(View v){
        i++;
        Log.d(tag,"Hiciste un click"+i);
        Toast.makeText(this,R.string.mensaje_click,Toast.LENGTH_LONG).show();
        Log.d(tag,"esta en onclick");
        Toast.makeText(this,"estas en onclick", Toast.LENGTH_SHORT).show();


    }



   /* @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"esta en onpause");
        Toast.makeText(this,"estas en onpause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"esta en onDestroy");
        Toast.makeText(this,"estas en onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"esta en onStop");
        Toast.makeText(this,"estas en onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"esta en onStart");
        Toast.makeText(this,"estas en onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"esta en onResume");
        Toast.makeText(this,"estas en onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"esta en onRestart");
        Toast.makeText(this,"estas en onRestart", Toast.LENGTH_SHORT).show();
    }
*/}
