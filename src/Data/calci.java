package Data;

public class calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=sub(67,20);
		System.out.println("Substraction= "+m);
		
		calci cc=new calci();
		float n=cc.mul(4,5,10.5f);
		System.out.println("Multiplication= "+n);
		//System.out.println("Multiplication= "+cc.mul(4,5));
	}
	public static int sub(int x,int y) {
		int z=x-y;
		return z;
	}
	
	public float mul(int i,int j,float f) {
		//float k=i*j*f;
		return i*j*f;
	}
	
	}
	
