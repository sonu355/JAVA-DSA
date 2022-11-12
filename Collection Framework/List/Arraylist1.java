import java.util.List;

public class Student implements Comparable<Student>{
    String name;
    int rollNo ; 

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    /*public String toString(){
        return "Student{" + 
                    "name='" + name + "\"' + 
    }*/
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        
        list.add(new Student("anuj", 4));
        list.add(new Student("Ramesh", 3));
        list.add(new Student("Shivam", 1));
        list.add(new Student("Rohit", 2));
    }

    @Override
    public int compareTo(Student arg0) {
        // TODO Auto-generated method stub
        return this.rollNo - hat.rollNo;
    }
}