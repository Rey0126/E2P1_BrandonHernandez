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
        boolean accion = false;
        if (e.getSource() == btton1) {

            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregrar un número\n2.Eliminar número\n3.Menú Principal\nIngrese una opcion"));

            switch (op) {

                case 1:

                    int base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingreso la opcion Agregar un número\nIngrese la base"));

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
                    array.add(nume);

                    accion = true;

                    break;

                case 2:
                    if (accion) {
                        int index = Integer.parseInt(JOptionPane.showInputDialog(null, nume.printArray(array) + "\n" + "Ingrese el indice del numero que desea eliminar"));
                        array.remove(index - 1);
                        JOptionPane.showMessageDialog(null, "Nueva Lista" + "\n" + nume.printArray(array));
                    } else{
                        JOptionPane.showMessageDialog(null,"Primero debes agregar un numero");
                    }
                    break;

                case 3:

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción Invalida!!!");

            }

        } else if (e.getSource() == btton2) {

            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Sumar número\n2.Restar número\n3.Multiplicar número\n4.Menú Principal\nIngrese una opcion"));

            switch (op) {

                case 1:
                    
                    int index1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingreso la opcion sumar un número\n" + nume.printArray(array) + "\nIngrese el indice del primer numero"));
                    int index2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el indice del segundo numero"));

                    String acum = "";

                    int sum = Integer.parseInt(array.get(index1 - 1).getNum());
                    sum += Integer.parseInt(array.get(index2 - 1).getNum());
                    acum += sum;

                    if (array.get(index1 - 1).getBase() > array.get(index2 - 1).getBase()) {
                        JOptionPane.showMessageDialog(null, "El resultado es " + acum + " base " + array.get(index1 - 1).getBase());
                    } else if (array.get(index1 - 1).getBase() == array.get(index2 - 1).getBase()) {
                        JOptionPane.showMessageDialog(null, "El resultado es " + acum + " base " + array.get(index1 - 1).getBase());
                    } else {
                        JOptionPane.showMessageDialog(null, "El resultado es " + acum + " base " + array.get(index2 - 1).getBase());
                    }

                    break;

                case 2:

                    int index3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingreso la opcion restar un número\n" + nume.printArray(array) + "\nIngrese el indice del primer numero"));
                    int index4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el indice del segundo numero"));

                    String acum2 = "";

                    int sum2 = Integer.parseInt(array.get(index3 - 1).getNum());
                    sum2 -= Integer.parseInt(array.get(index4 - 1).getNum());
                    acum2 += sum2;
                    if (sum2 > 0) {
                        if (array.get(index3 - 1).getBase() > array.get(index4 - 1).getBase()) {
                            JOptionPane.showMessageDialog(null, "El resultado es " + acum2 + " base " + array.get(index3 - 1).getBase());
                        } else if (array.get(index3 - 1).getBase() == array.get(index4 - 1).getBase()) {
                            JOptionPane.showMessageDialog(null, "El resultado es " + acum2 + " base " + array.get(index3 - 1).getBase());
                        } else {
                            JOptionPane.showMessageDialog(null, "El resultado es " + acum2 + " base " + array.get(index4 - 1).getBase());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El resultado es negativo");
                    }

                    break;

                case 3:

                    int index5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingreso la opcion multiplicar un número\n" + nume.printArray(array) + "\nIngrese el indice del primer numero"));
                    int index6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el indice del segundo numero"));

                    String acum3 = "";

                    int sum3 = Integer.parseInt(array.get(index5 - 1).getNum());
                    sum3 *= Integer.parseInt(array.get(index6 - 1).getNum());
                    acum3 += sum3;

                    if (array.get(index5 - 1).getBase() > array.get(index6 - 1).getBase()) {
                        JOptionPane.showMessageDialog(null, "El resultado es " + acum3 + " base " + array.get(index5 - 1).getBase());
                    } else if (array.get(index5 - 1).getBase() == array.get(index6 - 1).getBase()) {
                        JOptionPane.showMessageDialog(null, "El resultado es " + acum3 + " base " + array.get(index5 - 1).getBase());
                    } else {
                        JOptionPane.showMessageDialog(null, "El resultado es " + acum3 + " base " + array.get(index6 - 1).getBase());
                    }

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
