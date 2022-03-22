package ClassObject;

class Mahasiswa{
    String nama;
    String nim;
    String prodi;
}

public class DemoMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();//buat object m1 
        Mahasiswa m2 = new Mahasiswa();//buat object m2
        
        //inisialisasi var object
        m1.nim = "20201234567";
        m1.nama = "obet";
        m1.prodi = "informatika";
        m1.nama = "Ali";//update
        
        //proses
        
        //output data
        System.out.println(m1.nama);
        System.out.println(m1.nim);
        System.out.println(m1.prodi);
    }
}
