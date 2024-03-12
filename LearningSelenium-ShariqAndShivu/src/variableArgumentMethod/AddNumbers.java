package variableArgumentMethod;

public class AddNumbers {
	public static void main(String[] args) {
		System.out.println(add(2,3,4,19));
	}
	
	public static int add(int...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		//sum=a[0]+a[1]+a[2];
		return sum;
	}
}
