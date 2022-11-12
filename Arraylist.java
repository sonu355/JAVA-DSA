import java.util.List;

public class Arraylist implements Comparable<Arraylist>{
    String name;
    int rollNo ; 

    public Arraylist(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    /*public String toString(){
        return "Student{" + 
                    "name='" + name + "\"' + 
    }*/
    public static void main(String[] args) {
        List<Arraylist> list = new ArrayList<>();
        
        list.add(new Arraylist("anuj", 4));
        list.add(new Arraylist("Ramesh", 3));
        list.add(new Arraylist("Shivam", 1));
        list.add(new Arraylist("Rohit", 2));
    }

    @Override
    public int compareTo(Arraylist arg0) {
        // TODO Auto-generated method stub
        return this.rollNo - hat.rollNo;
    }
}