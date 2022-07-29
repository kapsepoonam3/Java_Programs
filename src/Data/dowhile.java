package Data;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do {
			System.out.println("Poonam");
			i++;
		}while(i<=1);
		System.out.println();
		int j=1;
		do {
			System.out.println(5*j);
			j++;
		}while(j<=10);
		System.out.println();
		int k=1,sum=0;
		do {
			sum=sum+k;
			k++;
		}while(k<=10);
		System.out.println("Sum= "+sum);
	}

}
