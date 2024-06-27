
public class Author {
	int id;
	String name;
	int age;
	
	void authorInfo() {
		System.out.println("Author Data");
		System.out.println("\tid : "+id);
		System.out.println("\tname : "+name);
		System.out.println("\tage : "+age);
		
	}
	class NovelAuthor extends Author{
		String location;
		String bookName;
		
		public void main(String[] args) {
			NovelAuthor novelAuthor=new NovelAuthor();
			novelAuthor.id=87689;
			
	}
	
	}
}
