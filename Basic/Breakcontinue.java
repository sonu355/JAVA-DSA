public class Breakcontinue {
    public static void main(String[] args) {
        
        //continue statement = its just keep current iteration
        for(int i = 1; i <= 10; i++){
            if(i > 5){
                continue;
            }
            System.out.println("Value is " + i);
        }

        //break statement = it breaks the entire loop
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.out.println("Value is " + i);
        }

    }
}
