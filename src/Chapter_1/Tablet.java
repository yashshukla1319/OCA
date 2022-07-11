package Chapter_1;

interface Gadget{
    default int doStuff() {
        return 1;
    }
}

abstract class Electronic{
    void getPower(){
        System.out.println("plug in ");
    }
}
public class Tablet extends Electronic implements Gadget{
    void go(){
        System.out.println(doStuff());
    }
    public int doStuff() {
        return 2;
        //System.out.println("show book ");
    }
    public static void main(String[] args){
        new Tablet().getPower();
        System.out.println(new Tablet().doStuff());
    }
}
