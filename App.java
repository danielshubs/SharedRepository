import javax.swing.*;

public class App {
    public static void main (String[] args) {

        JFrame ventana = new JFrame("Ventana");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setSize(200, 200);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Email");
        JTextField textField = new JTextField(10);
        panel.add(label);
        panel.add(textField);

        JTextArea textArea = new JTextArea(5, 15);
        JScrollPane scroll = new JScrollPane(textArea);
        panel.add(scroll);

        ventana.add(panel);
        ventana.setVisible(true);

    }

}
