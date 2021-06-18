/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarship;
import java.util.Scanner;
public class Scholarship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int R=in.nextInt();
       if(R>=1 && R<=50)
       {
           System.out.println(100);
       }
       else if(R>=51 && R<=100)
       {
           System.out.println(50);
       }
       else
       {
           System.out.println(0);
       }
               
       
    }
    
}
