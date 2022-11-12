public class Variables {
    public static void main(String[] args) {
        
        long l = 500000000l; // 8 bytes
        int i = 5; // 4 bytes to 32 bits  -2,147,483,648 to 2,147,483,647
        short s = 5; //2 bytes to 16 bits  -32768 to 32767
        byte b = 5;  //1 byte to 8 bits  -128 to 127
        float f = 5.5f;
        double d =  5.5;

        char c = 'A';
        c = 66; // american standard code fornformation interchange
        System.out.println(c);

        double d1 = 5; //implicit conversion
        int k = (int)5.6; //type casting 
        System.out.println(d1);
        

        //we can assign int value to long, short value to int, byte value to short and int
    
    }
}
