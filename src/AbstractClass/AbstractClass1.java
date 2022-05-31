package AbstractClass;
abstract class BangunRuangLingkaran{
    double jari;
    double PHI = 3.14;
    
    
    
    public double getLuasLingkaran(){
       return PHI*jari*jari; 
    }
    
    abstract double getVol();
    abstract double getLuas();
}

public class AbstractClass1 {
    
}
