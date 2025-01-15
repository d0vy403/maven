package maven2;


import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] primitiveArray = {2, 5, 1, 10, 3, 4};

        int min = Ints.min(primitiveArray);
        int max = Ints.max(primitiveArray);

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);

        int target = 5;
        boolean containsTarget = Ints.contains(primitiveArray, target);

        System.out.println("Does the array contain " + target + "? " + containsTarget);

        List<Integer> integerList = Ints.asList(primitiveArray);
        Integer[] integerArray = integerList.toArray(new Integer[0]);

        System.out.println("Converted Integer array: " + Arrays.toString(integerArray));
    }
}