package assignment;

import assignment.exceptions.InvalidProductException;
import assignment.exceptions.InvalidValueException;

public class SampleClass {
    
    public double calculateTaxRate(String productType) throws InvalidProductException {
        if(productType==null){
            throw new InvalidProductException("Productype cannot be null" +productType);
        }
        if (productType.equalsIgnoreCase("Bakery")) {
            return 0.05;
        }
        if (productType.equalsIgnoreCase("Beverage")) {
            return 0.075;
        }
        if (productType.equalsIgnoreCase("Produce")
                || productType.equalsIgnoreCase("Dairy")) {
            return 0.04;
        }
        if (productType.equalsIgnoreCase("Deli")
                || productType.equals("Meat")) {
            return 0.065;
        }
        if (productType.equalsIgnoreCase("Seafood")) {
            return 0.06;
        }
        throw new InvalidProductException("Unknown product type: " + productType);
    }

    public String getDensityQualifier(int dpi) throws InvalidValueException {

        if (dpi <= 0)
            throw new InvalidValueException("DPI value must be greater than zero");

        if (dpi == 213) { // Nexus 7
            return "tvdpi";
        }
        if (dpi <= 120) { // ldpi
            return "ldpi";
        }
        if (dpi <= 160) { // mdpi
            return "mdpi";
        }
        if (dpi <= 240) { // hdpi
            return "hdpi";
        }
        if (dpi <= 320) { // xhdpi
            return "xhdpi";
        }
        if (dpi <= 480) { // xxhdpi
            return "xxhdpi";
        }
        if (dpi <= 640) { // xxxhdpi
            return "xxxhdpi";
        }
        return "nodpi";
    }

}
