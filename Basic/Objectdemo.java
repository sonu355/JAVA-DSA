class Calc{
    int n;
    int m;
    int result;
     
            public void perform(){
                result = m + n;
        }
}
public class Objectdemo {
    public static void main(String[] args) {
        
    
        Calc obj = new Calc();
        obj.n = 76;
        obj.m = 53;

        obj.perform();
        System.out.println(obj.result);
    }
}
