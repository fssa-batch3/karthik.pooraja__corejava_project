package day10.misc;

class Division {
    public static int divisor(int a,int b) throws IllegalArgumentException{
    	if(b==0) {
    		throw new IllegalArgumentException("Divisor can't be zero");
    	}
    	int c=a/b;
    	return c;
    	
    }
}

public class CheckedVersusUncheckedException {
	public static void main(String[] args) {
	System.out.println(Division.divisor(5,1));
	}
}
