import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI {
    private StarThrive starThrive;
    private JList<String> jList;

    public GUI() {}

    public GUI(StarThrive starThrive, JList<String> jList) {
        this.starThrive = starThrive;
        this.jList = jList;
    }

    public void criarGUI() {
        JFrame f = new JFrame();
        /*f.setTitle("StarThrive"); n tem titulo pq vamos ter background */
        f.setSize(1000, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel background = new JLabel(new ImageIcon("BackgroungGUI.jpg"));

        JButton botaoAbrir = new JButton("Abrir programa");
        botaoAbrir.setBackground(Color.white);
        botaoAbrir.setFocusable(false);

        JPanel panel = new JPanel();
        panel.add(botaoAbrir);
    }
}

