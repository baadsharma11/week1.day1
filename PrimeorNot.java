package assinmentsweek1day1;

public class PrimeorNot {

	public static void main(String[] args) {
		int num = 92;
		int flag=0;
		for(int i=2; i<=5;i++) {
			if(num%i==0){
				System.out.println(num+"is not prime");
				flag =1;
				break;
			}
		}
		if(flag==0){
			System.out.println(num+"is prime");
		}

	}

}
