package assinmentsweek1day1;

public class fibinocci {

	public static void main(String[] args) {
		int first_num=0;
		int sec_num=1;
		int range = 8;
		System.out.println(first_num);
		System.out.println(sec_num);
		for(int i =1; i<=range; i++) {
			int sum = first_num+sec_num;
			System.out.println(sum);
			first_num=sec_num;
			sec_num = sum;
		}
			
	}

}
