import java.util.Set;

import controller.ContactoController;
import controller.Sets;
import utils.ContactoComparator;
public class App {
    public static void main(String[] args) throws Exception {
        //Sets set = new Sets();
        System.out.println("EINAR KAALHUS");
        //runHashSet(set);
        //runLinkedHashSet(set);
        //runTreeSet(set);
       // runTreeSetComparator(set);
        //runTreeSetComparatorRevez(set);
        

        ContactoController contactoController = new ContactoController();
    }

    public static void runHashSet(Sets sets){
        Set<String> elementos = sets.construirHashSet();
        System.out.println("---Hash Set---");
        System.out.println("Elementos del HashSet");
        for(String s : elementos) System.out.println(s);
    }

    public static void runLinkedHashSet(Sets sets){
        Set<String> elementos = sets.construirLinkedHashSet();
        System.out.println("---Linked Hash Set---");
        System.out.println("Elementos del LinkedHashSet"); 
        for(String s : elementos) System.out.println(s);      
    }

    public static void runTreeSet(Sets sets){
        Set<String> elementos = sets.construirTreeSet();
        System.out.println("---Tree Set---");
        System.out.println("Elementos del TreeSet (orden xxxxx)"); 
        for(String s : elementos) System.out.println(s);      
    }

    public static void runTreeSetComparator(Sets sets){
        Set<String> elementos = sets.construirTreeSetConComparador();
        System.out.println("---Tree Set comparador---");
        System.out.println("Elementos del TreeSet (orden xxxxx)"); 
        for(String s : elementos) System.out.println(s);         
    }
    public static void runTreeSetComparatorRevez(Sets sets){
        Set<String> elementos = sets.construirTreeSetConComparadorReves();
        System.out.println("---Tree Set comparador al revez---");
        System.out.println("Elementos del TreeSet (orden xxxxx)"); 
        for(String s : elementos) System.out.println(s);         
    }
}
