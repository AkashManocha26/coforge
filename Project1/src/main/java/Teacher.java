import javax.imageio.stream.ImageInputStream;

public class Teacher extends Person{
    private float pf;
    private float hra;
    private String location;

    public Teacher(int personId, String personName, int personSalary, float pf, float hra, String location) {
        super(personId, personName, personSalary);
        this.pf = pf;
        this.hra = hra;
        this.location = location;
    }

    public void personInfo(){
                super.personInfo();
            System.out.println("\thra: "+hra);
            System.out.println("\tpf: "+pf);
            System.out.println("\tgross salary: "+(getPersonSalary()-(getPersonSalary()*pf)+(getPersonSalary()*hra)));
            System.out.println("\tlocation: "+location);
        }

    public static void main(String[] args) {
        Teacher teacher=new Teacher(1,"akash",12000,0.05f,0.09f,"delhi");
        teacher.personInfo();
    }

}
