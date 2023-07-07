import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        ArrayUtils.reverse(arr);
        System.out.println(Arrays.toString(arr));
        int[] newarr = ArrayUtils.add(arr, 0, 1);

        System.out.println(Arrays.toString(newarr));
    }
}
