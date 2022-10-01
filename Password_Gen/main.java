package Password_Gen;

import java.util.*;

public class main {
  /**
 * @param args
 */
public static void main (String args[]){
    String lower = "qwertyuiopasdfghjklzxcvbnm";
    String upper = "QWERTYUIOPASDFGHJKLZXCVBNM";
    String num = "123456789";
    String specialchar = "<>,./?';:{}[]|_-()*&^%$#@!~`";
    String comb = upper+lower+num+specialchar;
    int len = 8;
    char[] password = new char[len];
    Random r = new Random();
    for(int i = 0; i < len ; i++){
        password[i] = comb.charAt(r.nextInt(comb.length()));

    }
    System.out.println("password : " + new String(password)); 
  }  
}
