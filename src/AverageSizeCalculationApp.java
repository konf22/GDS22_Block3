import java.util.Arrays;

public class AverageSizeCalculationApp {
    public static void main(String[] args) {

        int[] values1 = new int[5]; // values1_0, values1_1, values1_2
        values1[0] = 3;
        values1[1] = 4;
        values1[2] = 5;
        values1[3] = 7;
        values1[4] = 1;

        int[] values2 = {7, 5, 1, 2, 2};

        for (int i = 0; i < values1.length; i++) {
            System.out.println("i = " + i + "; value: " + values1[i]);
        }

        for (int i = 0; i < values2.length; i++) {
            System.out.println("i = " + i + "; value: " + values2[i]);
        }

        System.out.println("Addition");
        for (int i = 0; i < values1.length && i < values2.length; i++) {
            int result = values1[i] + values2[i];
            System.out.print(result);
            if (i < values1.length - 1){
                System.out.print(", ");
            }
        }
        //System.out.println();
        System.out.println("\nMultiplizieren");
        for (int i = 0; i < values1.length && i < values2.length; i++) {
            int result = values1[i] * values2[i];

            if (i < values1.length - 1)
                System.out.print(result + ", ");
            else
                System.out.print(result );

        }

        System.out.println();
        int sum = 0;
        for (int i = 0; i < values1.length; i++) {
            sum = sum + values1[i];
            //System.out.println("sum = " + sum);
        }
        System.out.println("total sum = " + sum);
        System.out.println("average = " + sum / (values1.length * 1.0));

        System.out.println(Arrays.toString(values1));
        System.out.println(Arrays.toString(values2));

    }
}
