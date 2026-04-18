package Lambda_expressions;

public interface Default {
    default void sayHello() {
    	System.out.println("Hello");
    }
}

class Child implements Default{
	
}

class MyClass{
	public static void main(String []args) {
		Child child = new Child();
		child.sayHello();
	}
}
