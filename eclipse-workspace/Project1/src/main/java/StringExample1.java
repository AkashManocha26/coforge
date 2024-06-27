
public class StringExample1 {
	public static void main(String[] args) {
		String var="We are learnng java. with java";
		if(var.contains("java"))
			System.out.println("java present at "+var.indexOf("java"));
		if(var.contains("java"))
			System.out.println("java present at "+var.lastIndexOf("java"));
		
		System.out.println("e present at "+var.indexOf('e'));
		
		String ar[]=var.split(" ");
		System.out.println("split method");
		System.out.println("No. of words are "+ar.length);
		
		for(String string:ar) {
			System.out.println(string);
		}
		
		String citiesList="delhi-aagra-mathura-jaipur";
		System.out.println(citiesList+" after split");
		
		for(String s:citiesList.split("-"))
			System.out.println(s+", ");
		
		citiesList="delhi-aagra&mathura@jaipur-kolkata raipur";
		
		
	}
}
