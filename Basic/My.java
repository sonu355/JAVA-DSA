import java.util.*;

public class My {
    public static void main (String[] args){  
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        //   String name =" Smai ";
        //   int n = 8;
        System.out.println("my"+name+"here is counting");
        for (int i=0; i<=n; i++){
            System.out.println(i);
        }
        scn.close();
       
    }

}