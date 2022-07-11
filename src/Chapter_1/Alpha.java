package Chapter_1;

public class Alpha {
    Alpha doStuff(){
        return new Alpha();
    }
}
class Beta extends Alpha{
    Beta doStuff(){
        return new Beta();
    }
}
