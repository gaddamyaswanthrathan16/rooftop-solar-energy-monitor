
    
import java.util.Scanner;

public class SolarCalculator {

    // Required method
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter morning energy generation:");
        double morning = sc.nextDouble();

        System.out.println("Enter evening energy generation:");
        double evening = sc.nextDouble();

        
        double total = calculateTotalEnergy(morning, evening);
        System.out.println("Total Energy Generated: " + total);

        sc.close();
    }
}
