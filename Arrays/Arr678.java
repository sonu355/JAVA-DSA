public class Arr678{
    public static void main(String[] args) {
    int[] arr = new int[] {76,94,25,98};

    int value = 989;
    boolean isPresent = false;
    for(int i=0; i < arr.length; i++){
      System.out.println(arr[i]);

      if(arr[i] == value){
        isPresent = true;
        break;           
      }
    }
    if (isPresent == true){
      System.out.println("Present");
    }else{
      System.out.println("Not Present");
    }
  }

}