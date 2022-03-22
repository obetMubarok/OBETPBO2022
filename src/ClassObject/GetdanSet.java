package ClassObject;
class Nasabah{
    private double saldo;
    private String nama;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNama() {
        return nama;
    }
    
    public void tarikTunai(double nominalTarik){
        //saldo = saldo - nominalTarik; // 120000 - 50000 = 70000
        saldo-=nominalTarik;
    }
    
}


public class GetdanSet {
    public static void main(String[] args) {
        Nasabah n1 = new Nasabah();
        Nasabah n2 = new Nasabah();
        
        n1.setNama("Obet");
        n1.setSaldo(120000);
        n1.tarikTunai(50000);
        
        n2.setNama("Ali");
        n2.setSaldo(200000);
        
        System.out.println("nama nasabah : "+n1.getNama());
        System.out.println("saldo : Rp "+n1.getSaldo());
    }
}
