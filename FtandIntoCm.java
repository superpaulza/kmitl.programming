import java.util.*;
    public class FtandIntoCm {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please input Height Ft ==> ");
            double ft = input.nextDouble();
            System.out.print("Plesae input Height in ==> ");
            double in = input.nextDouble();
            in = in*2.54;
            ft = ft*(2.54*12);
            double cm = in + ft;
            System.out.println("Height in cm is " + cm);
        }
    }
