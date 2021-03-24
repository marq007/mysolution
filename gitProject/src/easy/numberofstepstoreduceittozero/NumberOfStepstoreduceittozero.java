package easy.numberofstepstoreduceittozero;

public class NumberOfStepstoreduceittozero {

	public static void main(String[] arg) {
		NumberOfStepstoreduceittozero sol = new NumberOfStepstoreduceittozero();
		
		System.out.println(sol.numberOfSteps(16));

	}
	
	public int numberOfSteps (int num) {
        if(num>1000000) return -1;
		int countSteps = 0;
		int rem = 0;
        while(num>0) {
        	rem = num%2;
        	if(rem==0) {
        		//even
        		num = num/2;
        	}else {
        		//odd
        		num = num -1;
        	}
        	countSteps++;
        }
        
		return countSteps;
    }
	
}
