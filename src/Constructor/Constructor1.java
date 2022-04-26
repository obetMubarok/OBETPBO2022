package Constructor;
class Kubus{
    int sisi;
    String warna;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public Kubus(String warna) {
        this.warna = warna;
    }

    public Kubus(int sisi, String warna) {
        this.sisi = sisi;
        this.warna = warna;
    }

    public Kubus() {
    }

    
}
public class Constructor1 {
    public static void main(String[] args) {
        Kubus k1 = new Kubus();
    }
}
