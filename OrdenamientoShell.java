package ordenamientos.pkg;

public class OrdenamientoShell {

    public int[] ordenar(int[] data, int iteration) {

        if (iteration == 1) {
            OrdenamientoBurbuja burbuja = new OrdenamientoBurbuja();
            data = burbuja.ordenar(data);
        } else {

            for (int i = 0; i < iteration; i++) {
                //Crea un arreglo para ingresar los datos genericos
                int[] array = new int[((data.length / iteration) + 1)];
                for (int j = i, index=0; j < data.length; j = j + iteration,index++) {
                    //Agregar los datos de data[j] a array de 0 a N
                    array[index] = data[j];
                }
                //Ordenar los datos
                OrdenamientoBurbuja burbuja = new OrdenamientoBurbuja();
                array = burbuja.ordenar(array);
                //Regresar los valores
                for (int j = i, index = 0; i > data.length; j++, index++) {
                    data[j] = array[index];
                }
                //Regresar a data los valores de array a data
            }

            this.ordenar(data, iteration - 1);
        }
        return data;
    }
}
