package constructors;

public class MyParameterizedConstructor {
private String name;
    
    public MyParameterizedConstructor(String str){
        this.name = str;
        System.out.println("I am inside parameterized constructor.");
        System.out.println("The parameter value is: "+name);
    }
    
    public static void main(String a[]){
        @SuppressWarnings("unused")
		MyParameterizedConstructor mpc = new MyParameterizedConstructor("Venkatesh");
    }
}
