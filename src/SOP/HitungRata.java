package SOP;

public class HitungRata {
    public static void main(String[] args) {
        String nama = "Obet";
        double nilaiIpa, nilaiIps, nilaiAgam;
        double rata;
        
        
        
        nilaiIpa = 90;
        nilaiIps = 75;
        nilaiAgam = 100;
        
        rata = (nilaiIpa+nilaiIps+nilaiAgam)/3;
        
        
        System.out.format("nilai rata an. %s adalah %.2f", nama, rata);
}
}
