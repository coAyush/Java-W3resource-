import java.util.Scanner;

public class Test11 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Student2 obj=new Student2();
        obj.setId(sc.nextInt());
        obj.setName(sc.next());
        obj.setMarks(sc.nextFloat());
        System.out.println(obj);
    }
}
class Student2{
    private int id;
    private float marks;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
       if(marks<0 || marks>100){
           System.out.println("Invalid marks");
          return;
       }
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
