package clases;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    private JLabel lblNombres, lblApellidos;
    private JTextField txtNombres, txtApellidos;
    private JButton btnIngresar, btnNuevo, btnSalir;

    public Formulario() {
        setLayout(null);
        setTitle("EJERCICIO DE INTERFACES GRÁFICAS");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lblNombres = new JLabel("NOMBRES: ");
        lblNombres.setBounds(30, 40, 80, 30);
        add(lblNombres);

        lblApellidos = new JLabel("APELLIDOS: ");
        lblApellidos.setBounds(30, 90, 80, 30);
        add(lblApellidos);

        txtNombres = new JTextField();
        txtNombres.setBounds(150, 40, 200, 30);
        add(txtNombres);

        txtApellidos = new JTextField();
        txtApellidos.setBounds(150, 90, 200, 30);
        add(txtApellidos);

        btnIngresar = new JButton("BOTÓN INGRESAR");
        btnIngresar.setBounds(30, 150, 140, 30);
        add(btnIngresar);
        btnIngresar.addActionListener(this);

        btnNuevo = new JButton("BOTÓN NUEVO");
        btnNuevo.setBounds(200, 150, 140, 30);
        add(btnNuevo);
        btnNuevo.addActionListener(this);

        btnSalir = new JButton("BOTÓN SALIR");
        btnSalir.setBounds(120, 200, 140, 30);
        add(btnSalir);
        btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIngresar) {
            String nombres = txtNombres.getText();
            String apellidos = txtApellidos.getText();
            JOptionPane.showMessageDialog(null, "BIENVENIDO(A) " + nombres + " " + apellidos);
        } else if (e.getSource() == btnNuevo) {
            txtNombres.setText("");
            txtApellidos.setText("");
        } else if (e.getSource() == btnSalir) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Formulario mensajero = new Formulario();
        mensajero.setBounds(0, 0, 400, 300);
        mensajero.setVisible(true);
        mensajero.setResizable(false);
        mensajero.setLocationRelativeTo(null);
    }
}
