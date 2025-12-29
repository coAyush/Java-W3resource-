public class Copy_Constructor {
    public static void main(String[] args){
        A a=new A();
        A ref=new A(a);
    }
}
class A{
    int x,y;
    A(){
        this.x=10;
        this.y=15;
        System.out.println("x:"+this.x+" y:"+this.y);
    }
    A(A ref){//value copied from one instance
        // to another that is the utility of
        // copy constructor
        //Passing reference of one object as a
        // parameter to another constructor to
        // copy its content
        this.x=ref.x;
        this.y=ref.y;
        System.out.println("Copied from a to " +
                "ref"+this.x+" "+this.y);
    }
}