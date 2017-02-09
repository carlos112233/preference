package com.example.upam.hola_mundo;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Segundo extends AppCompatActivity {
   TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        mensaje=(TextView) findViewById(R.id.TextView2);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("name");
        mensaje.setText(dato);

    }

    public  void lanzar_implicito(View v){
        //Intent  x= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
         Intent x= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(x);

    }
}
