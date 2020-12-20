package practitest;

public class VJulyConditionTest {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 6;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
		
		String p = "Selenium";
		String q = "selenium";
		String k = "My name is KRUNAL";
		
		if (p.equals(q)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
		
		if (p.equalsIgnoreCase(q)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
		
		System.out.println(p.charAt(2));
		System.out.println(k.charAt(3));
		System.out.println(q.indexOf("n"));
		System.out.println(k.indexOf("l"));  // MAYBE if index is -1 then case sensitiveness
		System.out.println(k.indexOf("u"));  // MAYBE -ve index means due to case sensitiveness
		System.out.println(k.indexOf('U'));
	
	}

}
