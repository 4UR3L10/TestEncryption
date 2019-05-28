/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testencryption;

/**
 *
 * @author aurel
 */
public class Caeser extends Cipher
{

    public Caeser(String s)
    {
        super(s);
    }

    public String encode(String word)
    {
        return code(word, Constants.ENCODE_SHIFT);
    }

    public String decode(String word)
    {
        // Complete this method so that it decodes the encoded string
        return "testtttt";
    }

    String code(String word, int SHIFT)
    {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            ch = determineCharacter(ch, SHIFT);
            result.append(ch);
        }
        return result.toString();
    }

    public char determineCharacter(char ch, final int shift)
    {
        if (Character.isUpperCase(ch))
        {
            ch = (char) ('A' + (ch - 'A' + shift) % Constants.WRAP_AROUND);
        }
        // Complete the if/else so that lower case letters are accounted for
        return ch;
    }
}
