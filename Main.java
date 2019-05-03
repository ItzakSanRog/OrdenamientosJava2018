package ordenamientos.pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menu1 = 0, menu2 = 0;
        int[] arreglo = null;
        long tiempo1 = 0, tiempo2 = 0;
        Scanner sc = new Scanner(System.in);
        OrdenamientoBurbuja burbuja = new OrdenamientoBurbuja();
        OrdenamientoSeleccion seleccion = new OrdenamientoSeleccion();
        OrdenamientoInsercion insercion = new OrdenamientoInsercion();
        OrdenamientoShell shell = new OrdenamientoShell();
        //Sacar la mitad de data y luego mandarla como numero de iteraciones
        //Usar:     Nombre del arreglo = shell.ordenar(data2,(data.length/2));
        OrdenamientoMerge merge = new OrdenamientoMerge();

        System.out.println("Que tipo de datos utlizar\n"
                + "1.-100 elementos al azar\n"
                + "2.-50,000 elementos al azar\n"
                + "3.-100,000 elementos al azar\n"
                + "4.-100,000 elementos ordenados en orden inverso\n"
                + "5.-100,000 elementos ordenados\n"
                + "6.-100,000 elementos que sólo pueden ser números entre el 1 y el 5\n"
                + "7.- 500 datos aleatoreos");

        menu1 = sc.nextInt();

        System.out.println("Que tipo de ordenameiento utlizar\n"
                + "1.-Burbuja\n"
                + "2.-Selection\n"
                + "3.-Insertion\n"
                + "4.-Shell\n"
                + "5.-Merge\n"
                + "6.-Proximamente");
        menu2 = sc.nextInt();

        //Genera el arreglo
        switch (menu1) {
            case 1:

                arreglo = new int[100];
                for (int i = 0; i < 100; i++) {
                    int random = (int) ((Math.random() * 100) + 1);
                    arreglo[i] = random;
                }
                break;
            case 2:
                arreglo = new int[50000];
                for (int i = 0; i < 50000; i++) {
                    int random = (int) ((Math.random() * 100) + 1);
                    arreglo[i] = random;
                }
                break;
            case 3:
                arreglo = new int[100000];
                for (int i = 0; i < 100000; i++) {
                    int random = (int) ((Math.random() * 100) + 1);
                    arreglo[i] = random;
                }
                break;
            case 4:
                arreglo = new int[100000];
                for (int i = 0; i < 100000; i++) {
                    int random = (int) ((Math.random() * 100) + 1);
                    arreglo[i] = random;
                }
                arreglo = burbuja.ordenarInverso(arreglo);
                //Ordena a la inverso
                break;
            case 5:
                arreglo = new int[100000];
                for (int i = 0; i < 100000; i++) {
                    int random = (int) ((Math.random() * 100) + 1);
                    arreglo[i] = random;
                }
                arreglo = burbuja.ordenar(arreglo);
                //Ordena
                break;
            case 6:
                arreglo = new int[100000];
                for (int i = 0; i < 100000; i++) {
                    int random = (int) ((Math.random() * 5) + 1);
                    arreglo[i] = random;
                }
                break;
            case 7:
                arreglo = new int[500];
                for (int i = 0; i < 500; i++) {
                    int random = (int) ((Math.random() * 100) + 1);
                    arreglo[i] = random;
                }
                break;
            default:
                break;
        }
        //Switch para tipo de ordenamiento
        switch (menu2) {
            case 1:
                tiempo1 = System.nanoTime();
                arreglo = burbuja.ordenar(arreglo);
                tiempo2 = System.nanoTime();
                System.out.println(tiempo2 - tiempo1);
                break;
            case 2:
                tiempo1 = System.nanoTime();
                arreglo = seleccion.ordenar(arreglo);
                tiempo2 = System.nanoTime();
                System.out.println(tiempo2 - tiempo1);
                break;
            case 3:
                tiempo1 = System.nanoTime();
                arreglo = insercion.ordenar(arreglo);
                tiempo2 = System.nanoTime();
                System.out.println(tiempo2 - tiempo1);
                break;
            case 4:
                tiempo1 = System.nanoTime();
                arreglo = shell.ordenar(arreglo, (arreglo.length / 2));
                tiempo2 = System.nanoTime();
                System.out.println(tiempo2 - tiempo1);
                break;
            case 5:
                tiempo1 = System.nanoTime();
                arreglo = merge.ordenar(arreglo);
                tiempo2 = System.nanoTime();
                System.out.println(tiempo2 - tiempo1);
                break;

            default:
                break;
        }
    }
}
