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

class BBola extends BangunRuangLingkaran{
    //class ini wajib meg-override method abstract yang ada di class ayah
    @Override
    double getVol() {
        return 4/3 * 3.14 * jari * jari * jari;
    }

    @Override
    double getLuas() {
        return 4 * 3.14 *jari * jari;
    }
    
}

public class AbstractClass1 {
    public static void main(String[] args) {
        BangunRuangLingkaran BRL;
        
        BRL = new BBola();
        BRL.jari = 5;
        System.out.println(BRL.getLuas());
    }
}
