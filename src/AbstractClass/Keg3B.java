package AbstractClass;

interface CriticalDamage{
    double bonusDamage = 0.4;
}

abstract class Hero{
    private double healthPoint;
    private double attackDamage;
    private double defense;
    private int level;
    private boolean lifeStatus;
    
    public void attack(Hero target){
        System.out.println("Menyerang "+target);
    }
    
    public void reviewDamage(double damage){
        double realDamage = attackDamage - defense;
        healthPoint -= (damage-defense);
    }
}
public class Keg3B {
    
}
