package AbstractClass;
interface Kendaraan{
    public void start();
    public void stop();
    
}

class Mobil implements Kendaraan{

    @Override
    public void start() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Mobil mesin menyala");
    }

    @Override
    public void stop() {
        System.out.println("Mobil berhenti");
    }
    
}

class Motor implements Kendaraan{

    @Override
    public void start() {
        System.out.println("Motor mesin menyala");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop() {
        System.out.println("Motor berhenti");
    }
    
}
public class Interface1 {
    public static void main(String[] args) {
        Kendaraan k1;
        k1 = new Mobil();
        k1 = new Motor();
        k1.start();
        
        
        
    }
}
