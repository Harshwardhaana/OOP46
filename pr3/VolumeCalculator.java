public class VolumeCalculator {

    // Method to calculate the volume of a cube
    public Double calculateVolume(Double side) {
        return side * side * side;
    }

    // Method to calculate the volume of a cylinder
    public Double calculateVolume(Double radius, Double height) {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate the volume of a box
    public Double calculateVolume(Double length, Double width, Double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        VolumeCalculator calculator = new VolumeCalculator();

        // Test the volume calculation for a cube
        Double cubeVolume = calculator.calculateVolume(5.0);
        System.out.println("Volume of cube: " + cubeVolume);

        // Test the volume calculation for a cylinder
        Double cylinderVolume = calculator.calculateVolume(3.0, 7.0);
        System.out.println("Volume of cylinder: " + cylinderVolume);

        // Test the volume calculation for a box
        Double boxVolume = calculator.calculateVolume(4.0, 6.0, 8.0);
        System.out.println("Volume of box: " + boxVolume);
    }
}
