package Lambda_expressions;

public class Lambda {
    public static void main(String[] args) {
    	
    	Practice obj = new Practice() {
            public void sayHello() {
                System.out.println("Hello World");
            }
        };
//        Practice obj2 = () -> System.out.println("Hello World");
        obj.sayHello();
    }
}