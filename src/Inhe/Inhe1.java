package Inhe;

class Ayah{
    String nama;

    public Ayah(String nama) {
        this.nama = nama;
    }
    
    public void cek(){
        System.out.println("Sedang cek kesehatan");
    }
}

class Anak extends Ayah{

    public Anak(String nama) {
        super(nama);
    }
    //String nama;
    public void tampil(){
        cek();
    }
}

class Anak2 extends Ayah{
    String nama;

    public Anak2(String nama) {
        super(nama);
    }
    public void tampil(){
        System.out.println(super.nama);
    }
}



public class Inhe1 {
    
}
