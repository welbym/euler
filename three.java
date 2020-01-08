/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Math;
public class three{
  public static void main (String[] args){
    long num = 600851475143L;
    ArrayList<Integer> factors = new ArrayList<>();
    for(int i=3; i<Math.sqrt(num+0.0); i++){if(i%2==1&&num%i==0){factors.add(i);}}
    Iterator<Integer> itr = factors.iterator();
    while(itr.hasNext()){
      boolean prime = true;
      Integer checkNum = itr.next();
      for(int i=checkNum-2; i>=3; i-=2){if(checkNum%i==0){prime = false;}}
      if(prime==false){itr.remove();}
    }
    System.out.println(factors);
  }
}
