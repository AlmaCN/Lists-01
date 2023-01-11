package it.develhope.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        /**
         * Ho creato una lista non mutabile chiamata cityNames a cui ho aggiunto tre nomi di citta
         */
        List<String> cityNames = Arrays.asList("Roma", "Tokyo", "Narita");

        /**
         * Ho cercato di aggiungere il quarto elemento pero nella stampa del codice, mi da errore, in quanto la
         * lista e stata creata solo con tre spazi.
         */
        //cityNames.add("Dublino");

        /**
         * Ho cambiato il secondo elemento con Tegucigalpa
         */
        cityNames.set(1, "Tegucigalpa");

        /**
         * Ho printato il contenuto di cityNames
         */
        System.out.println(cityNames);


        /**
         * Ho creato una lista mutabile vuota chiaamata kingOfRome a cui ho aggiunto i nome dei 7 Re di Roma.
         */
        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tulius Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");

        /**
         * Ho creato un array che avesse le stesse dimensioni della lista dei Re di Roma
         */
        String[] kingsOfRomeArray = new String [kingsOfRome.size()];

        /**
         * Ho poi convertito la lista nel array appena creato
         */
        kingsOfRome.toArray(kingsOfRomeArray);

        /**
         * Ho modificato il settimo elemento dell'array
         */
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        /**
         * Ed infine ho printato il contenuto dell'array
         */
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}
