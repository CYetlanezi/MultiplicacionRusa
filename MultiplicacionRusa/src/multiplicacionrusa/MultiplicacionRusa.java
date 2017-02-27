package multiplicacionrusa;

import java.util.Scanner;

/**
 *
 * @author Claudia
 */
public class MultiplicacionRusa {
         public static Lista<Integer> div2;
         public static Lista<Integer> mul2;
         public static Scanner lee;
         
         public static void creaListas(int num1, int num2){
                  div2 = new Lista<Integer>();
                  mul2 = new Lista<Integer>();
                  if(num1 < num2){//num1 siempre el mayor
                            int aux;
                           aux = num1;
                           num1 = num2;
                           num2 = aux;
                  }
                  while(num2 >= 1){ // num2 siempre el menor
                           div2.insertaFinal(num2);
                           num2 = num2/2;
                           mul2.insertaFinal(num1);
                           num1 = num1*2;
                  }      
         }
         
         public static void main(String[] args) {
                  int num1,num2;
                  lee =  new Scanner(System.in);
                  System.out.println("Ingresa num1:  ");
                  num1 = lee.nextInt();
                  System.out.println("Ingresa num2: ");
                  num2 = lee.nextInt();
                  creaListas(num1,num2);
                  Rusa r = new Rusa();
                  System.out.println("Resultado = "+r.suma(div2, mul2));
        }
    
}
