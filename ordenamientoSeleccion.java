package ordenamientos.pkg;

/**
 * @author Edgar Itzak Sanchez Rogers
 */
public class OrdenamientoSeleccion {

    public int[] ordenar(int data[]) {
        int aux;
        int iteration = -1;
        int index = data.length - 1;

        for (int j = 0; j < index; j++) {
            iteration++         ;
            for (int i = iteration; i < index+1; i++) {
                if (data[(iteration)] > data[i]) {
                    aux = data[iteration];
                    data[iteration] = data[i];
                    data[i] = aux;
                }
            }
        }
        return data;
    }
}