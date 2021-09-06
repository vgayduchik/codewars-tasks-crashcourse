package basiс.program;

public class BasicProgramThirdTask {
    public static void main(String[] args) {
        // Bob needs a fast way to calculate the volume of a cuboid with three values:
        // length, width and the height of the cuboid.
        // Write a function to help Bob with this calculation.

        System.out.println(cuboidVolume(4,6,4));

    }
    public static int cuboidVolume(int length, int width, int height){
        return length * width * height;
    };
}
