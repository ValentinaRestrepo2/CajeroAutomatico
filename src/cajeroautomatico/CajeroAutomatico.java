package cajeroautomatico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Valentina Restrepo Arboleda
 */
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese el valor a retirar del cajero: ");
        int monto = scaner.nextInt();
        CajeroAutomatico retirocajero = new CajeroAutomatico();
        retirocajero.RetirarDinero(monto);
    }

    public void RetirarDinero(int monto) {
        int[] billetesDisponibles = {50000, 20000, 10000};
        ArrayList billetesdevuetos = new ArrayList();
        int xbillete = 0, contador = 0, sumaMonto = 0, aux = 0;
        int diferencia = monto;

        if (monto % 10000 == 0) {
            while (sumaMonto != monto) {
                diferencia -= xbillete;
                xbillete = SeleccionarBillete(billetesDisponibles, diferencia, aux);
                sumaMonto += xbillete;
                billetesdevuetos.add(xbillete);
                contador++;
            }
            for (int j = 0; j < billetesdevuetos.size(); j++) {
                System.out.println(billetesdevuetos.get(j));
            }
            System.out.println("El retiro de " + sumaMonto + " fue exitoso");
        }
    }

    int SeleccionarBillete(int[] billetesDisponibles, int diferencia, int aux) {
        for (int i = 0; i < billetesDisponibles.length; i++) {
            if (billetesDisponibles[i] <= diferencia) {
                aux = billetesDisponibles[i];
                break;
            }
        }
        return aux;
    }
}
