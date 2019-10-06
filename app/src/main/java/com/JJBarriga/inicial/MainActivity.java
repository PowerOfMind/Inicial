package com.JJBarriga.inicial;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {

        /*botonPrueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Boton pulsado");
            }
        });*/
    }


    private void instancias() {


    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.v("pmdm", "Pasando por el etado onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("pmdm", "Pasando por el etado onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("pmdm", "Pasando por el etado onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("pmdm", "Pasando por el etado onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("pmdm", "Pasando por el etado onPause");
    }
}
