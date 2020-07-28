package clases;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    private JLabel lbl;
    private JTextField txt;
    private JButton btn;

    public Formulario() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lbl = new JLabel("Mensaje");
        lbl.setBounds(20, 20, 70, 30);
        add(lbl);

        txt = new JTextField();
        txt.setBounds(110, 20, 140, 30);
        add(txt);

        btn = new JButton("Mostrar");
        btn.setBounds(80, 80, 130, 30);
        add(btn);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            String mensaje = txt.getText();
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

    public static void main(String[] args) {
        Formulario mensajero = new Formulario();
        mensajero.setBounds(0, 0, 300, 180);
        mensajero.setVisible(true);
        mensajero.setResizable(false);
        mensajero.setLocationRelativeTo(null);
    }
}
