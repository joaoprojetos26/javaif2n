import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        System.out.println("digite o valor da sua compra");
        Scanner sc = new Scanner(System.in);
        double compra = sc.nextDouble();
        if (compra<200){
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "valor da compra: "+compra +"\n" +"valor do desconto: "+(compra*0.05)+"\n"+ "valor da compra com desconto: "+(compra-(compra*0.05)),
                    "",
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
        } else if (compra>=200&&compra<=500) {
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "valor da compra: "+compra +"\n" +"valor do desconto :"+(compra*0.10)+"\n"+ "valor da compra com desconto: "+(compra-(compra*0.10)),
                    "",
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
        } else if (compra>500) {
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "valor da compra: "+compra +"\n" +"valor do desconto :"+(compra*0.15)+"\n"+ "valor da compra com desconto: "+(compra-(compra*0.15)),
                    "",
                    javax.swing.JOptionPane.QUESTION_MESSAGE);
        }else ;
        sc.close();
    }
}
