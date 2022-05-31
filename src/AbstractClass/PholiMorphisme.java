package AbstractClass;

class Hewan{
    public void speak(){
        System.out.println("Suara Hewan");
    }
}

class Bebek extends Hewan{
    public void speak(){
        System.out.println("Quack");
    }
}

class Kucing extends Hewan{
    public void speak(){
        System.out.println("Meaow");
    }
}



public class PholiMorphisme {
    public static void main(String[] args) {
        Hewan h1;
        
        h1 = new Kucing();
        h1 = new Bebek();
        h1 = new Hewan();
        h1.speak();
        
    }
}
