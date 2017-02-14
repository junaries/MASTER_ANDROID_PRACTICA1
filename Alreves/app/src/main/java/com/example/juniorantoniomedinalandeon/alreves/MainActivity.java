package com.example.juniorantoniomedinalandeon.alreves;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        if (null != bundle){ // el bundle no está vacío
            Log.i(getClass().getCanonicalName(), "EL BUNDLE TIENE COSAS");
            String nombre = (String) bundle.get("cadena");
            Log.i(getClass().getCanonicalName(), "El nombre es" +nombre);
        }
        else { // el bundle está vacío
            Log.i(getClass().getCanonicalName(), "EL BUNDLE ESTÁ VACIO (se ejecuta la actividad por primera vez");
        }
        Log.d(getClass().getCanonicalName(), "ENTRANDO EN ONCREATE");
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.button);

        EscuchaBoton escuchaBoton = new EscuchaBoton(this);

        boton.setOnClickListener(escuchaBoton);

        //Gson gson = new Gson();

    }

    @Override
    protected void onStart() {
        Log.d(getClass().getCanonicalName(), "ENTRANDO EN ON_START");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.d(getClass().getCanonicalName(), "ENTRANDO EN ON_RESTART");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(getClass().getCanonicalName(), "ENTRANDO EN ON_RESUME");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.d(getClass().getCanonicalName(), "ENTRANDO EN ON_STOP");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(getClass().getCanonicalName(), "ENTRANDO EN ON_DESTROY");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(getClass().getCanonicalName(), "ENTRANDO EN ON_PAUSE");
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        Log.d(getClass().getCanonicalName(), "ENTRANDO EN ON_SAVE_INSTANCE_STATE");
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("cadena","junior");


    }
}
