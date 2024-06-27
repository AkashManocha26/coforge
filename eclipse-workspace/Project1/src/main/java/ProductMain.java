
public class ProductMain {
	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product(10004,"Pant",1500);
		Product p3=new Product(10005,"Shoes",1700);
		Product p4=new Product(10006,20000);
		
		p1.productInfo();
		p2.productInfo();
		p3.productInfo();
		p4.productInfo();
	}
}
