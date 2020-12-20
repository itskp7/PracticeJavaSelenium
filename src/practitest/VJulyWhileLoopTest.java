package practitest;

public class VJulyWhileLoopTest {

	public static void main(String[] args) {
		
		int i=1;
		while (i<10) {
			System.out.println(i);
			i=i+1;     // i=i++ will print 1 infinitely  //here i=i+1 is equal to i++ in while loop
			if (i==5) {
				System.out.println("we got 5");
				break;
			}
		}
	}

}
