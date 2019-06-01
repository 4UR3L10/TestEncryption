/*
    Author: Aurelio Martinez 
    Class:  COP3337  
    Copyright© Aurelio Martinez
*/
package testencryption;

import javax.swing.JOptionPane;

public class TestEncryption
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String code, output = "";
        String text = JOptionPane.showInputDialog("Enter message");
        output += "The original message is \n" + text + "\n";               
        Cipher c = new Caeser(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nCeasar Cipher\nThe encrypted message is \n" + code + "\n";        
        c.decrypt(code);
        code = c.getDecodedMessage();
        output += "The decrypted message is \n" + code + "\n";        
        c = new Transpose(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nTranspose\nThe encrypted Transpose message is \n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output += "The decripted Transpose message is \n" + code + "\n";
        
        
        
//      // FIX THE PROBLEM.
        c = new Reverser(text);
        c.encrypt();            
        code = c.getEncodedMessage();        
        // code = c.reverseText(code);  // Problem cannot acces to a method in the class. 
        output += "\nReverser\nThe encrypted Reverse message is \n" + code + "\n";
        code = c.decode(code);
//      // FIX THE PROBLEM.
        output += "The decrypted Reverse message is \n" + code;
        display(output);
    }

    static void display(String s)
    {
        JOptionPane.showMessageDialog(null, s, "Encrypt/decrypt",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
