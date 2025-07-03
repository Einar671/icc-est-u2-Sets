package controller;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios(){
        System.out.println("Ejercicio 1: Tiene duplicados");
        System.out.println("Arreglo [1,2,3,4,5] "+tieneDuplicados(new int[] {1,2,3,4,5}));
        System.out.println("Arreglo [1,2,3,4,5,4,3,2,45] "+tieneDuplicados(new int[] {1,2,3,4,5,4,3,2,45}));

        System.out.println("Ejercicio 2: Es isograma");
        System.out.println("murciélago es isograma ="+esIsograma("murcielago"));
        System.out.println("cameleon es isograma ="+esIsograma("camaleón"));
        
        System.out.println("Ejercicio 3: Palabras Unicas");
        System.out.println("Numero de palabras unicas ="+contarPalabrasUnicas("La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía? Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente. En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas."
        ));
    }
    public boolean tieneDuplicados(int[] numeros){
        Set<Integer> numeroSet = new HashSet<>();
        for(int i : numeros) numeroSet.add(i);
            if(numeroSet.size()==numeros.length) return false;
        return true;
    }
    public boolean tieneDuplicadosProfe(int[] numeros){
        Set<Integer> numeroSet = new HashSet<>();
        for(int i : numeros)
            if(!numeroSet.add(i)) return true;
        return false;
    }
    public boolean esIsograma(String palabra){
        Set<Character> palabSet = new HashSet<>();
        for(char c : palabra.toCharArray()){
            if(!palabSet.add(c)) return false;
        }
        return true;
    }
    public int contarPalabrasUnicas(String frase){
    Set<String> unaVez = new HashSet<>();
    Set<String> repetidas = new HashSet<>();

    for (String palabra : frase.split(" ")) {
        if (!unaVez.add(palabra)) {
            repetidas.add(palabra);
        }
    }

    unaVez.removeAll(repetidas);

    return unaVez.size();
}
}
