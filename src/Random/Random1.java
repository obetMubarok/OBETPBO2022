package Random;
import java.util.Random;
public class Random1 {
    public static void main(String[] args) {
        Random ran = new Random();
        //3-10
        System.out.println(ran.nextInt(6)+3);//3 4 5 6 7 8 9 10
    }
}
