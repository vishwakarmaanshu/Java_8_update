package Lambda_expressions;

@FunctionalInterface
public interface Funtional {
    public void sayHello();
    
//    public void saySay();
    
    default void sayHello1() {
    	System.out.println("Hello World");
    }
    
    static void sayHello2() {
    	System.out.println("Heelo World");
    }
}
