
package javaapplication60;
import java.util.Random;

/**
 *
 * @author Dawid
 */
public class Neuron {
    
    
    double suma;
    double cel;
    double wynik;
    double w1;
    double w2;
    double c;
    double wfa;
    
   public Neuron()
   {
       Random generator = new Random();
       this.w1=generator.nextDouble();
       this.w2=generator.nextDouble();
       this.c=0.2;
       
       
       
       
   }
   
   
    public final void ucz(double x1, double x2, double cel)
   {
   
                this.cel=cel;
                wfa= funkcjaAktywacji1(x1,x2);
                if(wfa==cel)
                {
                    System.out.println("Nauczono dla: x1= "+ x1 + " oraz x2= "+ x2 + " dawać wynik "+ cel);
                }
                else
                {
                    System.out.println("Jeszcze nie nauczono...");
                }
            
                
          
        
       
   }
   
    
    public final double funkcjaAktywacji1(double x1, double x2)
    {
        this.suma= x1*this.w1+x2*this.w2;
        
        if(this.suma > 0.5)
        {
            wynik = 1;
        }
        else 
        {
            wynik = 0;
        }
        
        this.w1= w1+x1*(cel-wynik)*c;
        this.w2= w2+x2*(cel-wynik)*c;
        
        return wynik;
    }
    
  
    
    
}

