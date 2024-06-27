package practice;

public class Example1 {
	static float circumference(float radius) {
		return 2*3.14f*radius;
	}
	static float area(float radius) {
		return 3.14f*radius*radius;
	}
	public static void main(String[] args) {
		double d1=656565.55676;
		float f1=76676.6556F;
		float radius=56.45f;
		float cir=circumference(radius);
		float ar=area(radius);
		System.out.println("area of radius "+radius+" is "+ar);
		System.out.printf("\narea of radius %f is %f ",radius,ar);
		System.out.printf("\narea of radius %.2f is %.2f ",radius,ar);
		System.out.printf("\ncircumference of radius %.2f is %.2f ",radius,cir);
	}
}
