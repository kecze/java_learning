import javax.swing.*;


public class Zad81 {
    public static void main(String args[]) {
        try {
            String in = JOptionPane.showInputDialog("Podaj numer studenta");
            int n = Integer.parseInt(in);
            int suma = 0;
            for(int i = 0; i <= n; i++){
                suma += i;
            }
            System.out.println("Suma liczb od 0 do wprowadzonego numeru " + n + " to : " + suma);
        } catch (NumberFormatException e) {
            System.out.println("Wprowadź liczbę a nie znak!");
        }
    }
}
