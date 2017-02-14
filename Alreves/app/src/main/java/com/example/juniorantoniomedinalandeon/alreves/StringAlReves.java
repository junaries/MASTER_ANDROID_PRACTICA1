package com.example.juniorantoniomedinalandeon.alreves;

/**
 * Created by juniorantoniomedinalandeon on 17/1/17.
 */

public class StringAlReves {
    public static String mensajeSalida (String palabraRecibida){
        String volteado = "";

        for (int x=palabraRecibida.length()-1;x>=0;x--){
            volteado = volteado + palabraRecibida.charAt(x);
        }
        return volteado;

        /*String volteado = null;
                volteado = palabraRecibida.split("").reverse().join("");
             return volteado;*/
    }
}
