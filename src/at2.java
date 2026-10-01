import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a temperatura do ambiente");
        int temp = sc.nextInt();
        if (temp<18){
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "ligar o aquecedor",
                    "",
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
        } else if (temp>=18&&temp<=25) {
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "manter a temperatura atual",
                    "",
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
        } else if (temp>25) {
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "ligar ar condicionado",
                    "",
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
        }else;
        sc.close();
    }
}
