class Calc{
    int num1;
    int num2;
    int result;

    public Calc(){
        num1 = 5;
        num2 = 6;
        result = num1*num2;
    }
    public Calc(int num1){
         this.num1 = num1; //this variable
    }
    public Calc(double d){
        num1 = (int) d;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Calc obj =  new Calc();  //contructor
        System.out.println(obj.result);
    }
    
}
