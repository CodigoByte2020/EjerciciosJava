package parte3_piladinámica;

public class prueba {

    public static void main(String[] args) {

        /*int array1[] = new int[5];
        int array2[] = new int[10];*/
        int array1[] = {10, 15, 20};
        
        int array2[] = {2, 4, 6, 8, 10, 14};

        array1 = array2;

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
