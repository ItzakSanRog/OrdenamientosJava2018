package ordenamientos.pkg;

public class OrdenamientoInsercion {

    //Metodo de ordenamiento de Insertion
    public int[] ordenar(int[] data) {
        int aux;
        //Inicia desde el 1 porque el valor del arreglo 0 ya esta ordenado
        for (int i = 1; i < data.length; i++) {
            //Copio el aux
            aux = data[i];
            //Primero comparar  el valor 
            //Mover el arreglo data[j] "i veces" hasta encontrar un valor menor a data[i] (aux) y ponerlo en el arreglo
            for (int j = i - 1; j >= 0; j--) {
                if (data[j] > aux) {
                    data[j + 1] = data[j];
                    data[j] = aux;
                }
            }
        }
        return data;
    }
}
