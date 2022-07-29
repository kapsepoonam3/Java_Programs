package practice;

public class prime {

	public static void main(String[] args) {
		prime();
	}

	public static void prime() {
		int num=13;
		boolean prime=true;
		for(int i=2;i<num;i++) 
		{
			if(num%i==0) 
			{
				prime=false;
			}
		}
		if(prime=true) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
	}
	}