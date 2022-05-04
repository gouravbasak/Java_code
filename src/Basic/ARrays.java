package Basic;

import java.util.Arrays;

public class ARrays {
    public static void main(String[] args) {
        //1-d array
        int[] marks = new int[]{40,86,90};
        System.out.println(Arrays.toString(marks));
        //2-d array
        int[] [] marksnew = new int[][]{{40,86},{90,87}};
        System.out.println(Arrays.deepToString(marksnew));
        System.out.println(marksnew[1][0]);
    }
}
