package multithreading_java.ATM_APP.model;

class A{
    public void methodA(){
        System.out.println("Hello from A class");
    }
}
public class Main {
    A a;
    public Main(){
        
    }
    public  void methodMain(){
        A a = new A();
        a.methodA();
    }
  public static void main(String[] args) {
    A a = new A();
    Main m = new Main();
    m.methodMain();
  }
    
}
