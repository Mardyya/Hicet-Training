import java.util.regex.Pattern; 
public class Exp { 
 
    static String reverseWords(String str) 
    { 
        Pattern pattern = Pattern.compile("\\s"); 
 
        
        String[] a = pattern.split(str); 
        String result = ""; 
 
        for (int i = 0; i < a.length; i++) { 
            if (i == a.length - 1) 
                result = a[i] + result; 
            else
                result = " " + a[i] + result; 
        } 
        return result; 
    } 
 

    public static void main(String[] args) 
    { 
        
 
        String s2 = "   I love Java Programming"; 
        System.out.println(reverseWords(s2)); 
    } 
} 
