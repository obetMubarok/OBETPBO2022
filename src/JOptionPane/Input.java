package JOptionPane;

import javax.swing.JOptionPane;

public class Input {
    public static void main(String[] args) {
        String umurS = JOptionPane.showInputDialog("Masukkan Umur :");
        
        //System.out.println(nama);
        int umur = Integer.parseInt(umurS);
        umur++;
        
        JOptionPane.showMessageDialog(null,"Umur tahun depan : "+ umur);
        
    }
}
