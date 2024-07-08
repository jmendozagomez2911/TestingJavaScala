package javas.test.dataStructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class MagicNumber {
    public static void main(String[] args) {

        MagicNumber numero = new MagicNumber();

        if (numero.isMagicNumber(19)) {
            System.out.println("es un número mágico");
        }
        ;
    }
    private boolean isMagicNumber (int number){
        //suma = 0;
        //arrayList ListaInts;
        //int i = 0;
        //while (suma != 1 || i <= 100) repetir proceso
            //convertir a array de ints (listaInts)
            //suma de ints con bucle for -> int suma;
            //if (suma = 1)
                // return true;
            //else
                //i++
                //

        int number2 = number;
        int i = 0;


        while (i <= 100) {
            int suma = 0;
            List<Integer> listaInts = new ArrayList<>();

            while (number2 != 0){
                listaInts.add(number2 % 10);
                number2 /= 10;
            }

            for (int j=0; j < listaInts.size(); j++){
                suma+=listaInts.get(j);
            }

            if(suma == 1){
                return true;
            } else {
                i++;
                number2 = suma;
            }
        }
        return false;
    }

}
