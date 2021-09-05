package basiс.program;

import java.util.Arrays;

public class BasicProgramFourthTask {
    public static void main(String[] args) {

        System.out.println(isDivisible(15, 3));
    }
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }
}
