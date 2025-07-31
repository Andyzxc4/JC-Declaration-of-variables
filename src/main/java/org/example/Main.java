package org.example;

public class Main {
    public static void main(String[] args) {

        //  printing of local variables
        System.out.println("===== Local Variables =====");
        printLocalVariables();

        //  printing of instance variables
        System.out.println("\n===== Instance Variables =====");
        InstanceStatic instanceStatic = new InstanceStatic();
        instanceStatic.printInstanceVariables();

        //  printing of static variables
        System.out.println("\n===== Static Variables =====");
        instanceStatic.printStaticVariables();


    }

    public static void printLocalVariables() {
        //  local variables under/inside main method
        int localDecimal = 100;                    // decimal value
        int localHex = 0xFF;                        // hexadecimal (255)
        int localBinary = 0b1101;                   // binary (13)
        int localOctal = 014;                       // octal (12 in decimal)
        long localLong = 10_000_000L;               // long integer
        String localString = "Every step I take gets me closer to my goal."; // string

        System.out.println(localDecimal);
        System.out.println(localHex);
        System.out.println(localBinary);
        System.out.println(localOctal);
        System.out.println(localLong);
        System.out.println(localString);

    }
}