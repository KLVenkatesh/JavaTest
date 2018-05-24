package constructors;

public class MyDefaultConstructor {
	public MyDefaultConstructor(){
        System.out.println("I am inside default constructor...");
    }
    
    public static void main(String a[]){
        @SuppressWarnings("unused")
		MyDefaultConstructor mdc = new MyDefaultConstructor();
    }

}
