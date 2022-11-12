import java.util.Stack;;
public class Learnstack {
    public static void main(String[] args){
         Stack <String> city = new Stack<>();
            city.push("Mumbai");
            city.push("Delhi");
            city.push("Chennai");
            city.push("Kolkata");
            city.push("Nashik");
        
        System.out.println(city);

        System.out.println(city.peek());

        city.pop();
        System.out.println(city);

    }
}
