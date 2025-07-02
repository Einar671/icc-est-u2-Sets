package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparatorConNumero implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        //primero el apellido orden alfabetico
            int resultado= o1.getApellido().compareToIgnoreCase(o2.getApellido()); 
         //segundo si son iguales comparo por el nombre orden alfabetico
            if(resultado == 0){
                return o2.getTelefono().compareToIgnoreCase(o1.getTelefono());
            }
            return resultado;
    }
    

    
}
