package Overload;
class Aritmatika{
    public int hasil(int a, int b){
        return a+b;
    }
    
    public int hasil(int a, int b, int c){
        return a+b+c;
    }
    
    public double hasil(double a, double b){
        return a+b;
    }
}
public class OverloadDemo {
    public static void main(String[] args) {
        Aritmatika ar= new Aritmatika();
        
        System.out.println(ar.hasil(6, 9.8));
    }
}
