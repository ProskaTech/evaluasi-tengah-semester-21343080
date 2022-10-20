/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

import javax.swing.JOptionPane;

public class Soal3 {
    public static void main (String [] args){
        int angka;
        String a;

        a = JOptionPane.showInputDialog("Masukkan Angka");
        angka = Integer.parseInt(a);

        if(angka>=0){
            JOptionPane.showMessageDialog(null, "Angka"+" " +angka+" "+ "Merupakan bilangan positif");
        }
        else{
            JOptionPane.showMessageDialog(null, "Angka"+" " +angka+" " +"Merupakan bilangan negatif");
        }
    }
}
