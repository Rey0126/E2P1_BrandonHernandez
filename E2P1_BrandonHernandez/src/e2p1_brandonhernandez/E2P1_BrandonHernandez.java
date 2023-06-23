/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2p1_brandonhernandez;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/**
 *
 * @author brhb2
 */
public class E2P1_BrandonHernandez extends JFrame implements ActionListener {
    
    static ArrayList<Numero> array = new ArrayList<>();
    
    static Numero nume = new Numero();

    private JButton btton1;
    private JButton btton2;
    private JButton btton3;

    private JLabel title;

    private JPanel panel;

    public E2P1_BrandonHernandez() {

        setTitle("Brandon Hernández");

        setSize(400, 350);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setResizable(false);

        btton1 = new JButton("Números");
        btton1.setBounds(100, 100, 200, 50);
        btton1.addActionListener(this);

        btton2 = new JButton("Operaciones");
        btton2.setBounds(100, 160, 200, 50);
        btton2.addActionListener(this);

        btton3 = new JButton("Salir");
        btton3.setBounds(100, 220, 200, 50);
        btton3.addActionListener(this);

        title = new JLabel("Menú Principal");
        title.setBounds(150, 40, 200, 50);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);

        panel.add(title);
        panel.add(btton1);
        panel.add(btton2);
        panel.add(btton3);

        add(panel);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        E2P1_BrandonHernandez Menu = new E2P1_BrandonHernandez();
        Menu.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btton1) {

            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregrar un número\n2.Eliminar número\n3.Menú Principal\nIngrese una opcion"));

            switch (op) {

                case 1:
                    
                    JOptionPane.showMessageDialog(null, "Ingreso la opcion Agregar un número");
                    int base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base"));

                    while (base < 2 || base > 35) {
                        JOptionPane.showMessageDialog(null, "Base Invalida!");
                        base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base"));
                    }

                    int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));

                    while (num < 1) {
                        JOptionPane.showMessageDialog(null, "Número Invalido!");
                        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));
                    }

                    nume = new Numero(base, num);
                    array.add(new Numero(base,num));

                    break;

                case 2:
                    
                    JOptionPane.showMessageDialog(null, "Ingreso la opcion Eliminar un número");
                    int base2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base"));

                    while (base2 < 2 || base2 > 35) {
                        JOptionPane.showMessageDialog(null, "Base Invalida!");
                        base2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base"));
                    }

                    int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));

                    while (num2 < 1) {
                        JOptionPane.showMessageDialog(null, "Número Invalido!");
                        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));
                    }

                    nume = new Numero(base2, num2);

                    break;

                case 3:

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción Invalida!!!");

            }

        } else if (e.getSource() == btton2) {

            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Sumar número\n2.Restar número\n3.Multiplicar número\n4Menú Principal\nIngrese una opcion"));

            switch (op) {

                case 1:
                    
                    JOptionPane.showMessageDialog(null, "Ingreso la opcion Sumar un número");
                    int base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base"));

                    while (base < 2 || base > 35) {
                        JOptionPane.showMessageDialog(null, "Base Invalida!");
                        base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base"));
                    }

                    int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));

                    while (num < 1) {
                        JOptionPane.showMessageDialog(null, "Número Invalido!");
                        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));
                    }

                    nume = new Numero(base, num);

                    break;

                case 2:
                    
                    JOptionPane.showMessageDialog(null, "Ingreso la opcion Restar un número");
                    int base2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base"));

                    while (base2 < 2 || base2 > 35) {
                        JOptionPane.showMessageDialog(null, "Base Invalida!");
                        base2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base"));
                    }

                    int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));

                    while (num2 < 1) {
                        JOptionPane.showMessageDialog(null, "Número Invalido!");
                        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));
                    }

                    nume = new Numero(base2, num2);

                    break;

                case 3:
                    
                    JOptionPane.showMessageDialog(null, "Ingreso la opcion Multiplicar un número");
                    int base3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base"));

                    while (base3 < 2 || base3 > 35) {
                        JOptionPane.showMessageDialog(null, "Base Invalida!");
                        base3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base"));
                    }

                    int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));

                    while (num3 < 1) {
                        JOptionPane.showMessageDialog(null, "Número Invalido!");
                        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));
                    }

                    nume = new Numero(base3, num3);

                    break;

                case 4:                   
                    
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción Invalida!!!");

            }

        } else if (e.getSource() == btton3) {

            System.exit(0);

        }

    }

}
