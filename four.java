import java.util.ArrayList;
public class four{
  public static void main (String[] args){
    ArrayList<Integer> pal = new ArrayList<Integer>();
    for(int i=999; i>900; i--){
      for(int j=999; j>900; j--){
        String stringNum = Integer.toString(i*j);
        if(stringNum.substring(0,1).equals(stringNum.substring(5,6))
          && stringNum.substring(1,2).equals(stringNum.substring(4,5))
          && stringNum.substring(2,3).equals(stringNum.substring(3,4))){
          pal.add(i*j);
        }
      }
    }
    int largest = 0;
    for (int p: pal){if(p>largest){largest=p;}}
    System.out.println(largest);
  }
}
