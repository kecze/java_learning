import javax.swing.JOptionPane;

public class Zad92 {
    public static void main(String args[]) {
        int size, x_side, x_mid, cnt;
        String in = JOptionPane.showInputDialog("Podaj rozmiar tablicy");
        size = Integer.parseInt(in);
        System.out.println("Rozmiar to: " + size);
        
        x_side = 4;
        x_mid = 1;
        cnt = 1;

        for(int i = 1; i <= ((2 * size) + 1) * 9; i++) {
            for (int m = 0; m < (2 * size) + 1; m++) {
                for(int j = 0; j < x_side; j++) {
                    System.out.print(". ");
                }
                for(int k = 0; k < x_mid; k++) {
                    System.out.print("* ");
                }
                for(int j = 0; j < x_side; j++) {
                    System.out.print(". ");
                }
            }
            System.out.println();
            if (cnt ==  9) {
                cnt = 0;
                x_side = 4;
                x_mid = 1;
            }
            else if(cnt < 5) {
                x_side--;
                x_mid += 2; 
                }
            else {
                x_side++;
                x_mid -= 2;
            }
            cnt++;
        }
    }
}
