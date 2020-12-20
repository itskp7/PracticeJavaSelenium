package practitest;

public class VJulyArrayTest {

	public static void main(String[] args) {
		
		// Arrays are used to store multiple values in a single variable,
		// instead of declaring separate variables for each value.
		
		// String is a 'class' not a primitive data type
		
		String tool = "Selenium";      // here 'tool' is the variable name and 'selenium' is its value
		String[] tools = {"Selenium", "jira", "qc", "qtp"};    // [] means array, here array of string
		
		System.out.println(tools[0]);  // 0,1,2,3 are called the indexes
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		
		for (int i=0; i<=3; i++) {
			System.out.println(tools[i]);
		}
		
	}

}
