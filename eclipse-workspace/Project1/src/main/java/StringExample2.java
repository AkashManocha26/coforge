
public class StringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="hello";
//		String concat=s1.concat("World");
//		System.out.println(s1);
//		System.out.println(concat);
//		System.out.println(concat.replace('o','x'));
		
		StringBuffer buffer=new StringBuffer("Welcome ");
		System.out.println(buffer);
		buffer.append("to java");
		System.out.println(buffer);
		buffer.delete(2,5);
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
		
		String s1="hello";
		s1.replace('e','z');
		System.out.println(s1);
		
		StringBuffer buffer2=new StringBuffer(s1);
		buffer2.replace(0,3,"abc");
		System.out.println(buffer2);
		
		
	}

}
