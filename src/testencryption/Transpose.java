package testencryption;

public class Transpose extends Cipher
{

    Transpose(String s)
    {
        super(s);
    }

    public String encode(String word)
    {
        StringBuffer result = new StringBuffer(word);
        result.reverse();
        return result.toString();
    }

    public String decode(String word)
    {
        // Complete this method so that it reverses the encoded string;        
        // If encode does inverse the order of the message the inverse again will get you the decripted message.
        StringBuffer result = new StringBuffer(word);  
        result.reverse();
        return result.toString();        
    }   
   
}
