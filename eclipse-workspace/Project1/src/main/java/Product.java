
public class Product {
	int prdid;
	String prdname;
	float prdcost;
public Product() {
	prdid=10001;
	prdname="shirt";
	prdcost=600;
	System.out.println("Default constructor called");
}

public Product(int prdid, String prdname, float prdcost) {
	this.prdid = prdid;
	this.prdname = prdname;
	this.prdcost = prdcost;
	System.out.println("Overloaded constructor 1 called");
}
public Product(int prdid, float prdcost) {
	this(prdid,"Mobile",prdcost);
	this.prdid = prdid;
	this.prdcost = prdcost;
	System.out.println("Overloaded constructor 2 called");
}

void productInfo() {
	System.out.println("\nproduct data ");
	System.out.println("\tid : "+prdid);
	System.out.println("\tname : "+prdname);
	System.out.println("\tcost : "+prdcost);
}
public static void main(String[] args) {
	Product p1=new Product();
	Product p2=new Product();
	Product p3=new Product();
	
	p1.productInfo();
	p2.productInfo();
	p3.productInfo();
}
}
