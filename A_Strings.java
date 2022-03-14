package exemplesarrays;

public class A_Strings {

    public static void main(String[] args) {

        String[] ciutats = new String[5];

        String s = "Lleida";

        ciutats[0] = "Barcelona";
        ciutats[1] = s;

        // Concatenar Strings d'un array: 
        String trajecte = "Vaig desde "
                + ciutats[0] + " fins a " + ciutats[1];

        System.out.println(trajecte);
        System.out.println("***\n");
        

        //VALORS PER DEFECTE:
        
        System.out.println("VALORS PER DEFECTE:");
        // Als arrays de classe (com String) java assigna el valor null:
        System.out.println("length: " + ciutats.length);

        for (int i = 0; i < ciutats.length; i++) {
            System.out.println(ciutats[i]);
        }
        System.out.println("***\n");
        

        // ACCEDIR ALS ELEMENTS:
        
        System.out.println("ACCEDIR ALS ELEMENTS: així no!");
        // Sempre ho hem de fer posició a posició, el següent, no funciona:
        System.out.println(ciutats);
        System.out.println("***\n");

        // Sobreescriure un element:
        
        System.out.println("Sobreescriure un element");
        ciutats[1] = "València";
        for (int i = 0; i < ciutats.length; i++) {
            System.out.println(ciutats[i]);
        }

        // Accedir a una posició que no existeix:
        // Error: ArrayIndexOutOfBoundsException
        System.out.println("Accedir a una posició que no existeix:");
        ciutats[4] = "No hi puc afegir res. Sóc fora de l'array";
        System.out.println("Això dóna error: " + ciutats[4]);

    }

}
