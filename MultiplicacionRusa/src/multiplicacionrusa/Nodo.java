/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacionrusa;

/**
 *
 * @author Claudia
 */
public class Nodo <T>{
         public T info;
         public Nodo<T> sig;

         public Nodo(T info, Nodo<T> sig) {
                this.info = info;
                this.sig = sig;
         }
         
         
}
