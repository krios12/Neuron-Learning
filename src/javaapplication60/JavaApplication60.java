
package javaapplication60;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Dawid
 */
public class JavaApplication60 {

   
   
    public static void main(String[] args) {
        Neuron neuron  = new Neuron();
        
        
        Random r = new Random();
        int Low = 1;
        int High = 5;
        int Result;
        
                
        
        for(int i = 0 ; i <=10 ; i++)
        {
            Result = r.nextInt(High-Low) + Low;
            System.out.println(Result);
            switch (Result) {
                case 1:
                    neuron.ucz(1,0,1);
                    break;
                case 2:
                    neuron.ucz(0,1,1);
                    break;
                case 3:
                    neuron.ucz(0,0,0);
                    break;
                case 4:
                    neuron.ucz(1,1,1);
                    break;
                default:
                    break;
            } 
                    System.out.println("W1:"+neuron.w1);
                    System.out.println("W2:"+neuron.w2);
        }
        System.out.println("Końcowe W1:"+neuron.w1);
        System.out.println("Końcowe W2:"+neuron.w2);
        
         
    }
    
}
