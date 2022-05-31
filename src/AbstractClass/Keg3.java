package AbstractClass;

interface BangunDatar{
    public double luas();
    public double keliling();
}

class Lingkaran implements BangunDatar{
    int jariJari;

    @Override
    public double luas() {
        return 3.14 * jariJari*jariJari;
    }

    @Override
    public double keliling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class Persegi implements BangunDatar{
    int sisi;
    @Override
    public double luas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double keliling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class Tabung extends Lingkaran{
    public int tinggi;
    public double getVolume(){
        //dsdsdsfsfd
        return 3.14;
    }
}

class Limas extends Persegi{
    public int tinggi;
    public double getVolume(){
        return 3.14;
    }
}

public class Keg3 {
    
}
