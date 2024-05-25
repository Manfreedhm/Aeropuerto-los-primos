package matrizaeropuerto;

import java.util.Scanner;

public class MatrizAeropuerto {

    public static void main(String[] args) {
        //Se crea la matriz
        int vuelos[][] = new int[6][3];

        //Se carga la matriz
        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("Ingrese la cantidad de asientos para el destino:" + f + "horario" + c);
                vuelos[f][c] = teclado.nextInt();
            }
        }

        //Venta y asignar asientos
        Scanner teclado2 = new Scanner(System.in);
        String pais = "";
        int destino, horario, asientos;

        while (!pais.equalsIgnoreCase("final")) {
            System.out.println("Ingresar el NO de destino");
            destino = teclado.nextInt();
            System.out.println("Ingresar el horario de vuelo");
            horario = teclado.nextInt();
            System.out.println("Ingresar la cantidad de asientos");
            asientos = teclado.nextInt();

            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {

                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con éxito");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("No hay asientos disponibles");
                    }
                } else {
                    System.out.println("Horario no existente. Ingrese entre 0 y 2");
                }

            } else {
                System.out.println("Horario no existente. Ingrese entre 0 y 5");
            }
            System.out.println("¿Quiere seguir reservando?. Ingrese final para terminar o "
                    + "cualquier valor para seguir");
            pais = teclado2.next();
        }

    }
}
