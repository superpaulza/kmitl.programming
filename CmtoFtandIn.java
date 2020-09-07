import java.util.*;
    public class CmtoFtandIn {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please input Height cm ==> ");
            double cm = input.nextDouble();
            double ft = cm/30.48;
            cm = cm%30.48;
            double in = cm/2.54;
            cm = cm%2.54;
            System.out.println("Height in ft and in is " + ft + " ft " + in + " in " + cm + " cm ");
        }
    }
