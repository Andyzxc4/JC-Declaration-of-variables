package org.example;

public class InstanceStatic {
    // instance variables
    int instanceBinary = 45;       // decimal value; name might suggest binary, but 45 is decimal
    int instanceOctal = 58;        // decimal value; note: 58 is not valid in octal, so treat as decimal
    double instanceDouble = 1234.95; // double value

    // Static Variables
    static int staticHex = 0x1A2B;                     // hexadecimal value: 0x1A2B = 6699 in decimal
    static byte staticByte = 1;                        // byte value
    static String statingString = "Progress, not perfection."; // string value

    public void printInstanceVariables() {
        System.out.println(instanceBinary);
        System.out.println(instanceOctal);
        System.out.println(instanceDouble);
    }

    public void printStaticVariables() {
        System.out.println(staticHex);
        System.out.println(staticByte);
        System.out.println(statingString);
    }


}
