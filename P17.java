import cube.CubeDouble;
import cube.CubeFloat;
import cube.CubeInt;

class P17 {
    public static void main(String[] args) {
        CubeInt ci = new CubeInt();
        CubeFloat cf = new CubeFloat();
        CubeDouble cd = new CubeDouble();

        int intNum = 3;
        float floatNum = 2.5f;
        double doubleNum = 4.2;

        System.out.println("Cube of " + intNum + " = " + ci.cube(intNum));
        System.out.println("Cube of " + floatNum + " = " + cf.cube(floatNum));
        System.out.println("Cube of " + doubleNum + " = " + cd.cube(doubleNum));
    }
}
