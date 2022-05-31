package AbstractClass;
interface HP{
    double telepon(double detik);
}

class sim1 implements HP{

    @Override
    public double telepon(double detik) {
        return detik * 20;
    }
  
}

class sim2 implements HP{

    @Override
    public double telepon(double detik) {
        return detik * 10;
    }
    
}

public class TeleponDemo {
    public static void main(String[] args) {
        HP nokia;
        
        nokia = new sim2(); //poli
        System.out.println(nokia.telepon(30));
        
    }
}
