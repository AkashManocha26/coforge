
public class WrapperClass {
	public static void main(String[] args) {
		Integer x=new Integer(100);
		x++;
		String age="23";
		int age1=Integer.parseInt(age);
		
		System.out.println(age1);
		age1=age1+20;
		
		String valueOf=String.valueOf(1234);
		System.out.println(valueOf);
		
		Integer p1=67;
		String s2=p1.toString();
		System.out.println(s2);
		
		System.out.println(p1+" "+Integer.toBinaryString(p1));
		System.out.println(p1+" "+Integer.toHexString(p1));
		System.out.println(p1+" "+Integer.toOctalString(p1));
		
	}
}
