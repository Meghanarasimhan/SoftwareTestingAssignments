package assignment;

import assignment.exceptions.InvalidProductException;
import assignment.exceptions.InvalidValueException;
import org.junit.jupiter.api.DisplayName;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class SampleClassTest {

    @org.junit.jupiter.api.Test
    @DisplayName("TaxRateNegativeTests")
    void calculateTaxRateNegativeTest() {
        SampleClass sampleClass = new SampleClass();
        assertThrows(InvalidProductException.class, () -> {
           sampleClass.calculateTaxRate(null);
        });
        assertThrows(InvalidProductException.class, () -> {
            sampleClass.calculateTaxRate("Nothing");
        });

    }
    @org.junit.jupiter.api.Test
    @DisplayName("TaxRatePositiveTests")
    void calculateTaxRatePositiveTest() throws InvalidProductException {
        SampleClass sampleClass = new SampleClass();
        assertEquals(0.05,sampleClass.calculateTaxRate("Bakery") );
//        assertDoesNotThrow(() -> {
//            sampleClass.calculateTaxRate("Bakery");
//        });
        assertEquals(0.075,sampleClass.calculateTaxRate("Beverage") );
        assertEquals(0.04,sampleClass.calculateTaxRate("Produce") );
        assertEquals(0.04,sampleClass.calculateTaxRate("Dairy") );
        assertEquals(0.065,sampleClass.calculateTaxRate("Deli") );
        assertEquals(0.065,sampleClass.calculateTaxRate("Meat") );
        assertEquals(0.06,sampleClass.calculateTaxRate("Seafood") );

    }

    @org.junit.jupiter.api.Test
    @DisplayName("DensityQualifierPositiveTests")
    void getDensityQualifierPositiveTest() throws InvalidValueException {
        SampleClass sampleClass = new SampleClass();
        assertThrows(InvalidValueException.class, () ->{
            sampleClass.getDensityQualifier(-1);
        });
        assertThrows(InvalidValueException.class, () ->{
            sampleClass.getDensityQualifier(0);
        });
        assertEquals("tvdpi", sampleClass.getDensityQualifier(213));

        assertEquals("ldpi", sampleClass.getDensityQualifier(120));
        assertEquals("ldpi", sampleClass.getDensityQualifier(1));
        //assertEquals("ldpi", sampleClass.getDensityQualifier(121));

        assertEquals("mdpi", sampleClass.getDensityQualifier(160));
        assertEquals("mdpi", sampleClass.getDensityQualifier(121));

        assertEquals("hdpi", sampleClass.getDensityQualifier(240));
        assertEquals("hdpi", sampleClass.getDensityQualifier(161));

        assertEquals("xhdpi", sampleClass.getDensityQualifier(241));
        assertEquals("xhdpi", sampleClass.getDensityQualifier(320));

        assertEquals("xxhdpi", sampleClass.getDensityQualifier(321));
        assertEquals("xxhdpi", sampleClass.getDensityQualifier(480));

        assertEquals("xxxhdpi", sampleClass.getDensityQualifier(481));
        assertEquals("xxxhdpi", sampleClass.getDensityQualifier(640));

        assertEquals("nodpi", sampleClass.getDensityQualifier(641));








    }
}