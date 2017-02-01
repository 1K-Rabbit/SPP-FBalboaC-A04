/*//IMT Fabricio Arturo Balboa Cavazos A01411541
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.fbalboac.a02.func.trig;
import java.util.Scanner;
/**
 *
 * @author FabricioArturo
 */
public class SPPFBalboaCA02FUNCTRIG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner kb = new Scanner (System.in);
        
        int opEntrada;
        double cifra, resultado;
        
        System.out.println("Binevenido a la calculadora de funciones trigonometricas ");
        System.out.println("1. Para acceder a la funcion Seno, presione 1");
        System.out.println("2. Para accdener a la funcion Coseno, presione 2");
        System.out.println("3. Para acceder a la funcion Tangente, presione 3");
        opEntrada= kb.nextInt();
        
        switch (opEntrada)
        {case 1: System.out.println("Bienvenido al calculo de la funcion Seno");   
            cifra = ANG();
            resultado =  Math.sin(cifra);
            System.out.println("La funcion Seno de tu angulo de "+ cifra +" grados, es de "+ resultado +"·");
        case 2:
            System.out.println("Bienvenido al calculo de la funcion Coseno");
            cifra = ANG();
            resultado = Math.cos(cifra);
            System.out.println("La funcion Coseno de tu angulo de "+ cifra +" grados es de "+ resultado +"·");
        case 3:
            System.out.println("Bienvenido al calculo de la funcion Tangente");
            cifra = ANG();
            resultado = Math.tan(cifra);
            System.out.println("La funcion tangente de tu angulo de " + cifra + " grados, es de "+ resultado + ".");
                   
            default:
                System.out.println("Grcias por utilizar");
          
            
            }
        
        
        // TODO code application logic here
    }
    static double ANG (){
     double cifra;
            Scanner kb = new Scanner (System.in);
            System.out.println("Introduce el angulo en grados sexagesimales.");
            cifra  = kb.nextDouble(); 
            return cifra;
    }
   
    

}  
    

    
    
