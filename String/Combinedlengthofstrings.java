import java.util.Scanner;

class Combinedlengthofstrings{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        String array[] = new String[size];
        int totLength = 0;

        for(int i = 0; i < size; i++){
            array[i] = scn.next();
            totLength += array[i].length();
        }
        System.out.println(totLength);
        scn.close();
    }
}    