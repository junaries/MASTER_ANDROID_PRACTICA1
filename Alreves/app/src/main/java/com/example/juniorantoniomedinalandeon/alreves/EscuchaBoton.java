package com.example.juniorantoniomedinalandeon.alreves;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by juniorantoniomedinalandeon on 16/1/17.
 */

public class EscuchaBoton implements View.OnClickListener {
    private Context context;


    public EscuchaBoton (Context context)
    {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Log.d(getClass().getCanonicalName(), "Ha tocado el botón");
        Activity a = (Activity) context;
        EditText editText = (EditText) a.findViewById(R.id.editText);
        String nombre = editText.getText().toString();
        Log.d(getClass().getCanonicalName(), "Ha introducido el nombre = " + nombre);
        String mensaje_reverso = StringAlReves.mensajeSalida(nombre);

        ViewGroup caja_resultado = (ViewGroup)a.findViewById(R.id.resultado);

        if (caja_resultado.getChildCount()>0) //la lista ya ha sido inflada, es decir ya tiene vistas en su interior
        {
            TextView text = (TextView)a.findViewById(R.id.mensaje_salida);
            text.setText(mensaje_reverso);

        } else {

            LayoutInflater layoutInflater = a.getLayoutInflater(); //o LayoutInflater.from(a)
            View vista_inflada = layoutInflater.inflate(R.layout.layout_secundario,caja_resultado);
            TextView text = (TextView)vista_inflada.findViewById(R.id.mensaje_salida);
            text.setText(mensaje_reverso);

        }


        /*mostrarLayout(a.findViewById(R.id.activity_main));*/

    }

    /*private void mostrarLayout(View vista)
    {
        Log.d(getClass().getCanonicalName(), vista.getClass().getCanonicalName());

        if (vista instanceof ViewGroup)
        {
            ViewGroup viewGroup = (ViewGroup) vista;

            for (int i = 0; i<viewGroup.getChildCount(); i++)
            {
                View vistahija = viewGroup.getChildAt(i);
                mostrarLayout(vistahija);

            }
        }
    }*/


}










