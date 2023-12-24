import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Omega extends JFrame implements MouseListener {

    public JButton omega;
    public JButton back;
    public JButton hide;
    public JPanel panel;
    public JLabel welcome;
    public JLabel rectangle1;
    public JLabel rectangle2;
    public JLabel rectangle3;
    public JLabel rectangle4;
    public JLabel rectangle5;
    public JLabel rectangle6;
    Omega(){

        welcome = new JLabel("Welcome to omega");
        welcome.setForeground(new Color(200, 100, 30));
        welcome.setFont(new Font("Arial", Font.PLAIN, 50));

        panel = new JPanel();
        panel.setBounds(0,0,1000,70);
        panel.setBackground(new Color(0,0,0));
        panel.add(welcome);

        omega = new JButton("Omega");
        omega.setFont(new Font("Arial", Font.PLAIN, 30));
        omega.setBackground(new Color(0, 0, 0));
        omega.setForeground(new Color(200, 100, 30));
        omega.setBounds(70, 650, 250, 150);
        omega.setFocusable(false);
        omega.addActionListener(e -> rectangle1.setVisible(true));
        omega.addActionListener(e -> rectangle2.setVisible(true));
        omega.addActionListener(e -> rectangle3.setVisible(true));
        omega.addActionListener(e -> rectangle4.setVisible(true));
        omega.addActionListener(e -> rectangle5.setVisible(true));
        omega.addActionListener(e -> rectangle6.setVisible(true));

        back = new JButton("Back");
        back.setFont(new Font("Arial", Font.PLAIN, 30));
        back.setBackground(new Color(0, 0, 0));
        back.setForeground(new Color(200, 100, 30));
        back.setBounds(375, 650, 250, 150);
        back.setFocusable(false);
        back.addActionListener(e -> new Login());
        back.addActionListener(e -> dispose());

        hide = new JButton("Hide");
        hide.setFont(new Font("Arial", Font.PLAIN, 30));
        hide.setBackground(new Color(0, 0, 0));
        hide.setForeground(new Color(200, 100, 30));
        hide.setBounds(675, 650, 250, 150);
        hide.setFocusable(false);
        hide.addActionListener(e -> rectangle1.setVisible(false));
        hide.addActionListener(e -> rectangle2.setVisible(false));
        hide.addActionListener(e -> rectangle3.setVisible(false));
        hide.addActionListener(e -> rectangle4.setVisible(false));
        hide.addActionListener(e -> rectangle5.setVisible(false));
        hide.addActionListener(e -> rectangle6.setVisible(false));

        rectangle1 = new JLabel();
        rectangle1.setBackground(new Color(0,0,0));
        rectangle1.setOpaque(true);
        rectangle1.setBounds(100,100,200,200);

        rectangle2 = new JLabel();
        rectangle2.setBackground(new Color(0,0,0));
        rectangle2.setOpaque(true);
        rectangle2.setBounds(400,100,200,200);

        rectangle3 = new JLabel();
        rectangle3.setBackground(new Color(0,0,0));
        rectangle3.setOpaque(true);
        rectangle3.setBounds(700,100,200,200);

        rectangle4 = new JLabel();
        rectangle4.setBackground(new Color(0,0,0));
        rectangle4.setOpaque(true);
        rectangle4.setBounds(100,400,200,200);

        rectangle5 = new JLabel();
        rectangle5.setBackground(new Color(0,0,0));
        rectangle5.setOpaque(true);
        rectangle5.setBounds(400,400,200,200);

        rectangle6 = new JLabel();
        rectangle6.setBackground(new Color(0,0,0));
        rectangle6.setOpaque(true);
        rectangle6.setBounds(700,400,200,200);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Omega");
        this.setBounds(0,0,1000,1000);
        this.setLocation(500,20);
        this.getContentPane().setBackground(new Color(200,100,30));
        this.addMouseListener(this);
        this.setResizable(false);
        this.add(panel);
        this.add(omega);
        this.add(back);
        this.add(hide);
        this.add(rectangle1);
        this.add(rectangle2);
        this.add(rectangle3);
        this.add(rectangle4);
        this.add(rectangle5);
        this.add(rectangle6);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        rectangle1.setBackground(new Color(255,255,255));
        rectangle2.setBackground(new Color(255,255,255));
        rectangle3.setBackground(new Color(255,255,255));
        rectangle4.setBackground(new Color(255,255,255));
        rectangle5.setBackground(new Color(255,255,255));
        rectangle6.setBackground(new Color(255,255,255));

    }

    @Override
    public void mousePressed(MouseEvent e) {
        rectangle1.setBackground(new Color(200,100,30));
        rectangle2.setBackground(new Color(200,100,30));
        rectangle3.setBackground(new Color(200,100,30));
        rectangle4.setBackground(new Color(200,100,30));
        rectangle5.setBackground(new Color(200,100,30));
        rectangle6.setBackground(new Color(200,100,30));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        rectangle1.setBackground(new Color(0,0,255));
        rectangle2.setBackground(new Color(0,0,255));
        rectangle3.setBackground(new Color(0,0,255));
        rectangle4.setBackground(new Color(0,0,255));
        rectangle5.setBackground(new Color(0,0,255));
        rectangle6.setBackground(new Color(0,0,255));

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        rectangle1.setBackground(new Color(255,0,0));
        rectangle2.setBackground(new Color(255,0,0));
        rectangle3.setBackground(new Color(255,0,0));
        rectangle4.setBackground(new Color(255,0,0));
        rectangle5.setBackground(new Color(255,0,0));
        rectangle6.setBackground(new Color(255,0,0));

    }

    @Override
    public void mouseExited(MouseEvent e) {
        rectangle1.setBackground(new Color(0,255,0));
        rectangle2.setBackground(new Color(0,255,0));
        rectangle3.setBackground(new Color(0,255,0));
        rectangle4.setBackground(new Color(0,255,0));
        rectangle5.setBackground(new Color(0,255,0));
        rectangle6.setBackground(new Color(0,255,0));

    }
}
