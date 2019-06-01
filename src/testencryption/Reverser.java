package testencryption;

public class Reverser extends Transpose
{

    public Reverser(String s)
    {
        // Complete the constructor
        super(s);
    }

    public String reverseText(String word) // CAREFULLLL
    {
        // Complete this method so that it reverses the original string
        StringBuffer result = new StringBuffer(word);
         
        
        result.reverse();
        
        return result.toString();        
    }

    public String decode(String word)
    {
        // Complete this method so that it reverses the reversed string
        return "testttttttttttttt";
    }   
   
}

