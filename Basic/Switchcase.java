public class Switchcase {
    public static void main (String[] args) {
        int n = 3;

        switch(n)
        {
            case 1 : 
                System.out.println("one");
                break;
            case 2 : 
            System.out.println("Two");
            break;
            case 3 : 
            System.out.println("Three");
            break;
            case 4 : 
            System.out.println("Four");
            break;
            case 5 : 
            System.out.println("five");
            break;
            default:
            System.out.println("No Match");
            //switch doesnt support double
        }
    }
}
