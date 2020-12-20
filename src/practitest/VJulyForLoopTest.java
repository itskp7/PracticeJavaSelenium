package practitest;

public class VJulyForLoopTest {

	public static void main(String[] args) {
		
		// Lets say you wanna print number 1 to 10 (THIS IS Not Feasible)
		/*System.out.println(1);System.out.println(2);System.out.println(3);
		System.out.println(4);System.out.println(5);System.out.println(6);
		System.out.println(7);System.out.println(8);System.out.println(9);
		System.out.println(10);*/
		
		// so we use FOR Loop
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);  // putting like 'i' or "i" will print i 10 TIMES
			if (i==5) {
			System.out.println("we got 5");
			break;
			}
		}
		
		for (int a=1; a<5; a++) {
			System.out.println("KRUNAL");  // will print KRUNAL 4 times
		}
	}

}
