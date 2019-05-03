package ordenamientos.pkg;

public class OrdenamientoMerge {

    //Metodo ordenar
    public int[] ordenar(int[] data) {

        if (data.length == 1) {
            return data;
        } else {

            //Dividir el arreglo en 2 partes
            //Si es par
            int[] aux1;
            int[] aux2;
            if (data.length % 2 == 0) {

                aux1 = new int[data.length / 2];
                aux2 = new int[data.length / 2];
                //Si es impar
            } else {
                aux1 = new int[(data.length / 2 + 1)];
                aux2 = new int[data.length / 2];
            }
            int maxIndex1 = aux1.length;
            int maxIndex2 = aux2.length;
            int dataIndex = 0;

            for (int i = 0; i < maxIndex1; dataIndex++, i++) {
                aux1[i] = data[dataIndex];
            }

            for (int i = 0; i < maxIndex2; dataIndex++, i++) {
                aux2[i] = data[dataIndex];
            }
            
            //Aqui ocurre la magia
            data =this.union(this.ordenar(aux1), this.ordenar(aux2));
            
            return data;
        }
    }
    //Metodo Unino

    private int[] union(int[] data1, int[] data2) {
        //Crea un nuevo arreglo del tamaño de la suma de los dos pequeños
        int maxIndex1 = data1.length -1;
        int maxIndex2 = data2.length -1;
        int index1 = -1, index2 = -1;
        int resultIndex = 0;
        int[] result = new int[(data1.length + data2.length)];

        while (index1 < maxIndex1 || index2 < maxIndex2) {
            if (index1 == maxIndex1) {
                result[resultIndex] = data2[index2+1];
                resultIndex++;
                index2++;
            } else {
                if (index2 == maxIndex2) {
                    result[resultIndex] = data1[index1+1];
                    resultIndex++;
                    index1++;
                } else {
                    if (data1[index1+1] > data2[index2+1]) {
                        result[resultIndex] = data2[index2+1];
                        resultIndex++;
                        index2++;
                    } else {
                        result[resultIndex] = data1[index1+1];
                        resultIndex++;
                        index1++;
                    }
                }
            }
        }
        return result;
    }
}
