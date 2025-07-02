package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparatorConNumero implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        //primero el apellido orden alfabetico
                //primero el apellido orden alfabetico
            int resultado1= o1.getApellido().compareToIgnoreCase(o2.getApellido()); 
         //segundo si son iguales comparo por el nombre orden alfabetico
            if(resultado1 !=0) return resultado1;
            int resultado2= o1.getNombre().compareToIgnoreCase(o2.getApellido());
            if(resultado2 !=0) return resultado2;
            int resultado3 = o2.getTelefono().compareToIgnoreCase(o1.getTelefono());
            if(resultado3 !=0) return resultado3;
            return resultado1;
    }
    

    
}
