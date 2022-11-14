class Casio{
    public void add(int i, int j){
        System.out.println(i+j);
    }
    public void add(int i, int j, int k){
        System.out.println(i+j+k);
    }
    public void add(float i, float j){
        System.out.println(i+j);
    }
}
public class Methodoverloading {
    public static void main(String[] args) {
        Casio cas = new Casio();
        cas.add(5,4);

        cas.add(5, 8, 9);
         
        cas.add(5.6f,6.7f);

    }
}
