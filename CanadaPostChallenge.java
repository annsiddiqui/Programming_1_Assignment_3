import java.util.Scanner;
/**
 * @author Qurrat-al-Ain Siddiqui
 */
public class CanadaPostChallenge {
    public void run() {
        Scanner keyboard = new Scanner(System.in); 
        
        // Declare constants (the postal code characters, shipping weight, and volumetric rate)
        
        final int VOLUMETRIC_RATE = 6_000;
        final double MINIMUM_SHIPPING_WEIGHT = 0.75;
        final int CHARACTERS_IN_FSA = 3;
        
        // Get inputs from user

        System.out.print("Please enter the package width in cm: ");
        double packageWidth = keyboard.nextDouble();
        
        System.out.print("Please enter the package height in cm: ");
        double packageHeight = keyboard.nextDouble();
        
        System.out.print("Please enter the package length in cm: ");
        double packageLength = keyboard.nextDouble();
        
        System.out.print("Please enter the package weight in kg: ");
        double packageWeight = keyboard.nextDouble();
        
        // Remember to automatically add the space and all CAPS LOCK for postal code!
        
        keyboard.nextLine();
        System.out.print("Postal code of destination: ");
        String destPostalCode = keyboard.nextLine().toUpperCase();

        // Calculate
        
        double volume = packageWidth * packageHeight * packageLength;
        double volumetricEquivalent = volume / VOLUMETRIC_RATE;
        double shippingWeight = packageWeight;
        
        // Begin the if statements here
        // remember to format the statements for the shipping weights
        
        String shippingCalculatedBy = "package weight";
        if (volumetricEquivalent > packageWeight) {
            shippingWeight = volumetricEquivalent;
            shippingCalculatedBy = "the volumetric equivalent of weight";
        }
        
        String displayedShippingWeight = "";
        
        if (shippingWeight <= MINIMUM_SHIPPING_WEIGHT) {
            shippingWeight = MINIMUM_SHIPPING_WEIGHT;
            displayedShippingWeight = String.format("%.2f", shippingWeight);
        } else {
            shippingWeight = Math.round(2 * shippingWeight) / 2.0;
            displayedShippingWeight = String.format("%.1f", shippingWeight);
        }

        // Postal code specfics 
        
        String forwardSortationArea = destPostalCode.substring(0, CHARACTERS_IN_FSA);
        
        // Print the outputs for the user - format correctly!!!

        System.out.format("The shipping charge will be based on %s.%n", shippingCalculatedBy);
        System.out.format("Look up weight row %s.%n", displayedShippingWeight);
        System.out.format("Forward Sortation Area: %s.", forwardSortationArea);
    }
}
