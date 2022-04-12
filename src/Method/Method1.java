package Method;

class Calculator{
    String versi = "54.56";
    public void cetakVersi(){
        System.out.println(versi);
    }
    
    public int jumlah(int bil1, int bil2){
        return (bil1 + bil2);
    }
    
    public int get100(){
        return 100;
    }
    
    public void ubahVersi(String versiBaru){
        versi = versiBaru;
    }
}

public class Method1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        //c1.cetakVersi();
        //c1.ubahVersi("57.00");
        //c1.cetakVersi();
        System.out.println(c1.jumlah(5, 6));
        //int nilai = c1.get100();
        
        //System.out.println(c1.get100());
        
    }
}
