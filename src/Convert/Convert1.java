package Convert;

public class Convert1 {

    public static void main(String[] args) {
        int num1 = 1; // 32 bits of memory to hold the value
        int num2 = 1; // 32 bits of memory to hold the value
        byte num3; // 8 bits of memory reserved
        num3 = (byte)(num1 + num2); // causes compiler error
        //byte hasil= 100;
        byte hasil = 30 + 10;
    }
}
