import java.util.ArrayList;
public class five{
  public static void main (String[] args){
    boolean keepLoop = true;
    int number = 20;
    while(keepLoop){
          if(number%20==0&&number%19==0&&number%18==0&&number%17==0
          &&number%16==0&&number%15==0&&number%14==0&&number%13==0
          &&number%12==0&&number%11==0&&number%10==0&&number%9==0
          &&number%8==0&&number%7==0&&number%6==0&&number%5==0
          &&number%4==0&&number%3==0&&number%2==0&&number%1==0)
          {keepLoop=false;} else {number+=20;}
    }
    System.out.println(number);
  }
}
