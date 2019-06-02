package testencryption;

public class Reverser extends Transpose
{

    public Reverser(String s)
    {
        // Complete the constructor
        super(s);
    }

    public String reverseText(String word) 
    {
        // Complete this method so that it reverses the original string
        
        // Setting the order of the words of the String.
        StringBuffer result = new StringBuffer(word);
        result.reverse();   
        
        // Coverting the StringBuffer result to String.        
        String str = result.toString();
        
        // Getting the words out of the Strings.
        String [] words = str.split("\\s+");
        
        // String to save the reversed words.
        String strCounter = "";
        
        // Recurring the array, reversing each word and storing the words in a String.
        for (int i = 0; i < words.length; i++) 
        {
            StringBuffer newResult = new StringBuffer(words[i]);
            words[i] = newResult.reverse().toString();   
            strCounter = strCounter + words[i] + " ";
        }        
        
        return strCounter;      
    }

    public String decode(String word)
    {
        // Complete this method so that it reverses the reversed string
               
        StringBuffer result = new StringBuffer(word);
        result.reverse();        
    
        return result.toString();         
    }   
   
}

