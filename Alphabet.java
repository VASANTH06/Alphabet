import java.io.*;
import java.util.*;
class Alphabet
{
  
      public static void main(String[] args) {
  
        Scanner scan=new Scanner(System.in);
        char c=scan.next().charAt(0);  
        if(( (c >='a' )&&(c <='z'))||((c >='A' )&& (c<= 'Z')))
        {
            System.out.println("alphabet");
        }
        else
        {
            System.out.println("number");
        }
        
    }
    }
