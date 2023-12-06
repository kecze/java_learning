import javax.swing.JOptionPane;

public class Zad93 {
    public static void main(String args[]) {
        String in = JOptionPane.showInputDialog("Podaj kwotę");
        double kwota = Double.parseDouble(in);
        System.out.println("Kwota to: " + kwota);
        double[] bilon = {5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        double my_kwota = 0;
        int licznik = 0;
        for (int i = 0; i < bilon.length; i++) {
            while(my_kwota <= kwota) {
                if(my_kwota + bilon[i] <= kwota){
                    my_kwota += bilon[i];
                    licznik++;
                } else break;
            }
            if(licznik != 0) {
                System.out.println(licznik + " * " + bilon[i] + " zł");

            }
            licznik = 0;

        }
    }
}
