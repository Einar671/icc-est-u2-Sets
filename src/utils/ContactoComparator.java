package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
            int resultado= o1.getApellido().compareToIgnoreCase(o2.getApellido()); 
         //segundo si son iguales comparo por el nombre orden alfabetico
            if(resultado == 0){
                return o1.getNombre().compareToIgnoreCase(o2.getNombre());
            }
            return resultado;
    }
    

    
}
