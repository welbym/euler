public class six{
  public static void main (String[] args){
    int sumOfSquares=0;
    int sums=0;

    for(int i=1; i<=100; i++){sumOfSquares+=(i*i);}
    for(int i=1; i<=100; i++){sums+=i;}
    int squareOfSums = sums*sums;

    System.out.println(squareOfSums + " - " + sumOfSquares + " = " +
                        (squareOfSums-sumOfSquares));
  }
}
