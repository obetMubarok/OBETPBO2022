package AbstractClass;

abstract class BangunRuang{
    abstract public void getLuasPermukaan();
    abstract public void getVolume();
}
class Kerucut extends BangunRuang{

    @Override
    public void getLuasPermukaan() {
        
    }

    @Override
    public void getVolume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class Bola extends BangunRuang{

    @Override
    public void getLuasPermukaan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getVolume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

public class Praktikum {
    
}
