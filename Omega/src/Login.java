import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    public JButton button;
    public JButton button2;
    public JButton cancel;
    public JLabel label;
    public JLabel username;
    public JLabel password;
    public JTextField field;
    public JPasswordField pass_word;
    public JPanel panel;
    public String empty = "";

    Login() {

        field = new JTextField("Username");
        field.setFont(new Font("Arial", Font.PLAIN, 30));
        field.setBounds(400, 250, 500, 100);
        field.setForeground(new Color(200, 100, 30));
        field.setBackground(new Color(0, 0, 0));
        field.setEditable(true);

        pass_word = new JPasswordField("Password");
        pass_word.setFont(new Font("Arial", Font.PLAIN, 30));
        pass_word.setBounds(400, 450, 500, 100);
        pass_word.setForeground(new Color(200, 100, 30));
        pass_word.setBackground(new Color(0, 0, 0));
        pass_word.setEditable(true);

        username = new JLabel("Username:");
        username.setFont(new Font("Arial", Font.PLAIN, 30));
        username.setBounds(150, 200, 200, 200);
        username.setForeground(new Color(0, 0, 0));

        password = new JLabel("Password:");
        password.setFont(new Font("Arial", Font.PLAIN, 30));
        password.setBounds(150, 400, 200, 200);
        password.setForeground(new Color(0, 0, 0));


        button = new JButton("Omega");
        button.setFont(new Font("Arial", Font.PLAIN, 30));
        button.setBackground(new Color(0, 0, 0));
        button.setForeground(new Color(200, 100, 30));
        button.setBounds(60, 700, 250, 150);
        button.setFocusable(false);
        button.addActionListener(e -> JOptionPane.showConfirmDialog(null,"Welcome to Omega"));
        button.addActionListener(e -> field.setEditable(true));
        button.addActionListener(e -> field.setEnabled(true));
        button.addActionListener(e -> pass_word.setEditable(true));
        button.addActionListener(e -> pass_word.setEnabled(true));

        button2 = new JButton("Login");
        button2.setFont(new Font("Arial", Font.PLAIN, 30));
        button2.setBackground(new Color(0, 0, 0));
        button2.setForeground(new Color(200, 100, 30));
        button2.setBounds(365, 700, 250, 150);
        button2.setFocusable(false);
        button2.addActionListener(e -> JOptionPane.showConfirmDialog(null,"Login Success"));
        button2.addActionListener(e -> new Omega());
        button2.addActionListener(e -> dispose());

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Arial", Font.PLAIN, 30));
        cancel.setBackground(new Color(0, 0, 0));
        cancel.setForeground(new Color(200, 100, 30));
        cancel.setBounds(670, 700, 250, 150);
        cancel.setFocusable(false);
        cancel.addActionListener(e -> JOptionPane.showConfirmDialog(null,"Decline Approved"));
        cancel.addActionListener(e -> field.setText(empty));
        cancel.addActionListener(e -> pass_word.setText(empty));

        label = new JLabel("Welcome to Omega");
        label.setForeground(new Color(200, 100, 30));
        label.setFont(new Font("Arial", Font.PLAIN, 50));

        panel = new JPanel();
        panel.setBounds(0, 0, 1000, 70);
        panel.setBackground(new Color(0, 0, 0));
        panel.add(label);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Omega");
        this.setBounds(0, 0, 1000, 1000);
        this.setLocation(500, 20);
        this.getContentPane().setBackground(new Color(200, 100, 30));
        this.setResizable(false);
        this.add(button);
        this.add(button2);
        this.add(cancel);
        this.add(panel);
        this.add(username);
        this.add(password);
        this.add(field);
        this.add(pass_word);
        this.setVisible(true);
    }

}
