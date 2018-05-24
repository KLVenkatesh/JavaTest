package constructors;

public class MyOverloading {
	public MyOverloading(){
        System.out.println("Inside default constructor");
    }
    public MyOverloading(int i){
        System.out.println("Inside single parameter constructor with int value");
    }
    public MyOverloading(String str){
        System.out.println("Inside single parameter constructor with String object");
    }
    public MyOverloading(int i, int j){
        System.out.println("Inside double parameter constructor");
    }
    
    public static void main(String a[]){
        @SuppressWarnings("unused")
		MyOverloading mco = new MyOverloading();
        @SuppressWarnings("unused")
		MyOverloading spmco = new MyOverloading(10);
        @SuppressWarnings("unused")
		MyOverloading dpmco = new MyOverloading(10,20);
	@SuppressWarnings("unused")
	MyOverloading dpmc = new MyOverloading("java2novice");
    }

}
