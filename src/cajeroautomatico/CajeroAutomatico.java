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
        int monto = scaner.nextInt(); //Se captura el monto a retirar 
        CajeroAutomatico retirocajero = new CajeroAutomatico();
        retirocajero.RetirarDinero(monto);
    }

    /**
     * @param monto el valor a retirar del cajero
     */
    public void RetirarDinero(int monto) {
        int[] denominacionBilletes = {50000, 20000, 10000};
        int xbillete = 0, contador = 0, sumaMonto = 0, aux = 0;
        int diferencia = monto;
        ArrayList billetesdevuetos = new ArrayList();

        if (monto % 10000 == 0) { // Valida que el monto sea múltiplo de 10.000
            while (sumaMonto != monto) {
                diferencia -= xbillete;
                xbillete = SeleccionarBillete(denominacionBilletes, diferencia, aux);
                sumaMonto += xbillete;
                billetesdevuetos.add(xbillete);
                contador++;
            }
            for (Object billetesdevueto : billetesdevuetos) {
                System.out.println("Billete de " + billetesdevueto);

            }
            System.out.println("El retiro de " + sumaMonto + " fue exitoso");
        }
    }

    /**
     * @param billetesDisponibles vector con las denominaciones de billetes que
     * maneja el cajero (10.000,20.000,50.000)
     * @param diferencia valor que existe entre el monto y sumaMonto, es decir
     * lo que resta para completar el retiro
     * @param aux variable auxiliar que almacena el billete que más se adapta o
     * se acerca a la diferencia
     */
    public int SeleccionarBillete(int[] denominacionBilletes, int diferencia, int aux) {
        for (int i = 0; i < denominacionBilletes.length; i++) {
            if (denominacionBilletes[i] <= diferencia) {
                aux = denominacionBilletes[i];
                break;
            }
        }
        return aux;
    }
}
