/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;
class Calculator2{
    double tax = 0.05;
    double tip = 0.15;
    
    public void total(double person){
        System.out.println(person *(1+tax+tip));
    }
}
public class Method2 {
    public static void main(String[] args) {
        Calculator2 c2 = new Calculator2();
        c2.total(10);
        c2.total(12);
        c2.total(9);
        c2.total(8);
        c2.total(7);
        
        
    }
}
