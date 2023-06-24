/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2p1_brandonhernandez;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author brhb2
 */
public class Numero {

    private int base;
    private String num;

    public Numero() {

    }

    public Numero(int base, int num) {

        this.base = base;
        this.num = decToBase(num);
        System.out.println(this.num);

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public char numToChar(int numero) {

        char carac = '0';

        if (numero >= 0 || numero <= 9) {

            carac = (char) (numero + 48);

        }
        if (numero >= 10) {

            carac = (char) (numero + 87);

        }

        return carac;
    }

    public int charToNum(char carac) {

        int num = 0;

        if (carac >= 48 || carac <= 57) {

            num = (int) (carac - 48);

        } else if (carac >= 97 || carac <= 122) {

            num = (int) (carac - 97);

        }

        return num;
    }

    public String decToBase(int numero) {

        String num = "";

        while (base >= numero) {

            num += numero % base;
            
            numero = numero/base;

        }
        num += numero;

        return num;
    }

    public int baseToDec(String decimal) {

        String cad = decimal;

        for (int i = cad.length(); i < 0; i--) {

            cad += cad;

        }
        int resultado = 0;
        for (int i = 0; i < cad.length(); i++) {

            char x = cad.charAt(i);

            resultado += charToNum(x) * Math.pow(base, i);

        }

        return resultado;
    }

    public String printArray(ArrayList<Numero> array) {

        String acum = "";
        for (int i = 0; i < array.size(); i++) {

            acum += ((i + 1 + ". ") + array.get(i).getNum() + " base " + array.get(i).getBase());
            acum += "\n";
        }
        return acum;
    }

}
