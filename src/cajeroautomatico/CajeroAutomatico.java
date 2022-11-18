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
        CajeroAutomatico retirocajero;
        retirocajero = new CajeroAutomatico();
        retirocajero.RetirarDinero(); //llamamos al metodo principal
    }

    public void RetirarDinero() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese el valor a retirar del cajero");
        int money = scaner.nextInt();
        int[] billetes = {50000, 20000, 10000};
        ArrayList billetesdevuetos = new ArrayList();
        int contador, xb = 0, i = 0, sumaMoney = 0;
        int dif = money;

        if (money % 10000 == 0) {
            while (sumaMoney != money) {
                dif = dif - xb;
                System.out.println("dif " + dif);
                xb = SeleccionarBillete(billetes, dif);
                System.out.println("xb " + xb);
                sumaMoney = sumaMoney + xb;
                System.out.println("suma " + sumaMoney);
                billetesdevuetos.add(xb);
                i++;
            }
            for (int j = 0; j < billetesdevuetos.size(); j++) {
                System.out.println(billetesdevuetos.get(j));
                System.out.println("El retiro de " + sumaMoney + " fue exitoso");
            }
        }
    }

    int SeleccionarBillete(int[] billetes, int dif) {
        int aux = 0;
        for (int i = 0; i < billetes.length; i++) {
            if (billetes[i] <= dif) {
                aux = billetes[i];
                break;
            }
        }
        return aux;
    }
}
