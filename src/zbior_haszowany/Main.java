package zbior_haszowany;

import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        //utworzenie zbioru haszowanego
        Set<String> zbior = new HashSet<>();

        //dodawanie lancuchow znakow do zbioru
        zbior.add("Małgorzata");
        zbior.add("Laura");
        zbior.add("Natalia");
        zbior.add("Michał");
        zbior.add("Krzysiek");
        zbior.add("Paweł");
        zbior.add("Magda");

        //wyswietlanie wszystkich elementow zbioru haszowanego
        System.out.println("\nWyswietlenie wszystkich elementow zbioru haszowanego");

        System.out.println(zbior + ".");

        System.out.println("=============================================");

        for (String z: zbior)
        {
            System.out.print(z.toUpperCase() + ", ");
        }

        //przetwarzanie wszystkich elementow za pomoca metody forEach
        System.out.println();

        System.out.println("=============================================");

        zbior.forEach(e -> System.out.print(e.toLowerCase() + ", "));
    }
}
