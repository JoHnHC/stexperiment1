package experiment1;

public class MyTest {
	public boolean GivenNub(int GivenNumber) {
		boolean result = false;
		int[] Posible = {1,2,3,5,6,7,8,20,21,22,23,25,26,27,28,50,51,52,53,55,56,57,58,70,71,72,73,75,76,77,78};
		for(int i=0;i<31;i++) {
			if(GivenNumber == Posible[i]) {	
				result = true;
			    break;
			}
		}
		return result;
	}
	
}
