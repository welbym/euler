import java.util.ArrayList;
public class seven {
public static void main (String[] args){
	ArrayList<Integer> primeNumbers = new ArrayList<>();
	int checkNum = 2;
	while(primeNumbers.size() <= 10001) {
		boolean prime = true;
		if (checkNum % 2 == 0) {
			prime = false;
		} else {
			for(int i = checkNum - 1; i >= 2; i--) { if(checkNum % i == 0)  { prime = false; }}
		}
		if(prime) { primeNumbers.add(checkNum); }
		checkNum++;
	}
	System.out.println(primeNumbers.get(9999));
}
}
