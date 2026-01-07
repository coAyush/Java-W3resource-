public class Test25 {
    static void main() {
        Parent  parent = new Child();
        new Child().getInfo();
    }
}
class Parent{
     public void check(){
        System.out.println("Parent");
    }
    public static void getInfo(){
        System.out.println("I am Parent");
    }
}
class Child extends Parent{
    public static void getInfo(){
        System.out.println("I am Child");
    }
}
