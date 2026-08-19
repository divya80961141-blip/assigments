public interface interfacecar{


class car implements interfacecar{
    public void start(){
        System.out.println("Car is starting.");
    }
}
public  static void main(String [] args){
    car c = new car();
    c.start();
}
}

