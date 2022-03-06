package Algoritm;

public class study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test(3);
		
	}
	
	public static void test(int t) {
		int i=t ;
		System.out.println("Hello"+i);
		

		
		if(i ==0) {
			return;
		}
		System.out.println(i);
		//당연히 무한루프..~
		test(i-1);
		//test(5);
		
	}

}



