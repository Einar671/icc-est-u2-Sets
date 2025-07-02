package controller;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorConNumero;

public class ContactoController {

    public ContactoController(){
        System.out.println("Apellido y Nombre");
        runTreeContacto();
        
        System.out.println("Apellido, Nombre, Telefono");
        runTreeContactoConNumero();

    }

    private void runTreeContacto() {
        ContactoComparator contactoComparator = new ContactoComparator();
        Set<Contacto> contactos = new TreeSet<>(contactoComparator);

        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));


        for(Contacto s:contactos) System.out.println(s);
    
    }
        private void runTreeContactoConNumero() {
        ContactoComparatorConNumero contactoComparatorConNumero = new ContactoComparatorConNumero();
        Set<Contacto> contactos = new TreeSet<>(contactoComparatorConNumero);

        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));


        for(Contacto s:contactos) System.out.println(s);
    
    }

}
