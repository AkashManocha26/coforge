
public class StringPalindrome {
	
	
	static boolean checkPalindrome(String s1){
		String rev="";
		for (int i =s1.length()-1; i >=0; i--) {
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev)) {
			return true;
		}
		return false;
	}
	static boolean checkPalindrome1(String s1){
		char arr[]=s1.toCharArray();
		int index=0;
		for (int i = s1.length()-1; i >=0; i--) {
			arr[index++]=s1.charAt(i);
		}
		return s1.equals(new String(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="naman";
		System.out.println(checkPalindrome(s1));
		System.out.println(checkPalindrome1(s1));
	}

}
