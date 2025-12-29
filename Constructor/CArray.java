import java.util.Arrays;
import java.util.List;

public class CArray {
    public static void main(String[] args) {
        Classroom c=new Classroom(9,
                new String[]{"Ayush","Piyush",
                        "Jayesh"});
        System.out.println(c);
    }
}

class Classroom{
    int std;
    String [] students=new  String[3];
    public Classroom(int std,String [] arr){
        this.std=std;
        this.students=arr;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "std=" + std +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
