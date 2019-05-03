package ordenamientos.pkg;

/**
 * @author Edgar Itzak Sanchez Rogers
 */
public class OrdenamientoBurbuja {

    public int[] ordenar(int data[]) {
        int aux;
        int next;
        int index = data.length - 1;
        boolean swap;

        for (int j = 1; j < index; j++) {
            next = 0;
            swap = false;
            for (int i = 0; i <= (index - j); i++) {
                next++;
                if (data[i] > data[next]) {
                    aux = data[next];
                    data[next] = data[i];
                    data[i] = aux;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return data;
    }

    public int[] ordenarInverso(int data[]) {
        int aux;
        int next;
        int index = data.length - 1;
        boolean swap;

        for (int j = 1; j < index; j++) {
            next = 0;
            swap = false;
            for (int i = 0; i <= (index - j); i++) {
                next++;
                if (data[i] < data[next]) {
                    aux = data[next];
                    data[next] = data[i];
                    data[i] = aux;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return data;
    }
}
