package arrayOne;

import java.util.HashMap;
import java.util.Map;

public class UnioinAndIntersection {

    static int printUnion(int[] arr1, int[] arr2, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
  
        
        /* Print remaining elements of 
         the larger array */
        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");

        return 0;
    }

    public static void main(String[] args) {
      /*  int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
        printUnion(arr1, arr2, m, n);*/


        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            m.put(arr1[i], 1);
        }

        for (int i = 0; i < arr2.length; i++) {

            if (m.containsKey(arr2[i])) {
                System.out.print(arr2[i] + " ");

            } else {
                m.put(arr1[i], 1);
            }

        }

        System.out.println("are duplicates");

        System.out.println(m.keySet());


    }

}
