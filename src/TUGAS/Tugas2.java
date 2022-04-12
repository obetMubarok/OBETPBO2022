package TUGAS;

class AkunOvo{
    private String nama;
    private double saldo;

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void cekSaldo(){
        System.out.println("Saldo : "+saldo);
        
    }
    public void beliPulsa(double pulsa){
        saldo -= pulsa;
    }
    public void isiSaldo(double nominal){
        saldo += nominal;
    }
    public void transfer(double nominal, AkunOvo x){
        saldo -= nominal;
        
        x.saldo += nominal;
    }
}

class Tugas2{
    public static void main(String[] args) {
        AkunOvo akun1 = new AkunOvo();
        AkunOvo akun2 = new AkunOvo();
        
        akun1.setSaldo(100000);
        akun2.setSaldo(500000);
        
        akun1.isiSaldo(50000);
        akun1.cekSaldo();
        
    }
}