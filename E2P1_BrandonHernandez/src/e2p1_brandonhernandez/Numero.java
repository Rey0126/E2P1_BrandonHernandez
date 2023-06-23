/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2p1_brandonhernandez;
import java.util.ArrayList;
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
        
    }

    public char numToChar(int numero) {      
        
        char carac = '0';
        
        if (numero  >= 0 || numero <= 9) {
            
            carac = (char)(numero + 48);
            
        } else if(numero >= 10){
            
            carac = (char)(numero + 87);
            
        }       
        
        return carac;
    }
    
    public int charToNum(char carac){
        
        int num = 0;
        
        if(carac >= 48 || carac <= 57){
            
            num = (int)(carac - 48);
            
        } else if(carac >= 97 || carac <= 122){
            
            num = (int)(carac - 97);
            
        }
        
        return num;
    }
    
    public String decToBase(int numero){
        
        String num = "";
        
        while(base >= numero){
            
            num += base % numero;
            
        }
        num += numero;
        
        for (int i = num.length(); i < 0; i--) {
            
            num += num;
            
        }
        
        return num;
    }
    
    public int baseToDec(String decimal){
        
        for (int i = decimal.length(); i < 0; i--) {
            
            decimal += decimal;
            
        }
        int resultado = 0;
        for (int i = 0; i < decimal.length(); i++) {
            
            char x = decimal.charAt(i);
            
             resultado += Math.pow(charToNum(x),i);
            
        }
        
        return resultado;
    }
    
    public void printArray(ArrayList<Numero> array){
        
        
        
    }

}
