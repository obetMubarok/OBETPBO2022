package ClassObject;

class Kucing{
    String nama;
    int umur;
    String makanan;
    
    public void meow(){
        System.out.println("Kucing meow");
    }
    public void play(){
        System.out.println("kucing bermain");
    }
    public void eat(){
        System.out.println("kucing makan");
    }
}

public class DemoKucing {
    public static void main(String[] args) {
        Kucing cat1 = new Kucing();
        cat1.nama = "opal";
        cat1.umur = 11;
        cat1.makanan = "mice";
        
        
             
        System.out.println("nama dari kucing ke-1 adalah "+cat1.nama);
        cat1.play();
    }
}
