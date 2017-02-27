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
public class Lista<T> {
         protected Nodo<T> prim;

         public Lista() {
                  prim = null;
         }
         
         public String toString(){
                  String resp = "";
                  Nodo<T> p;
                  p = prim;
                  while(p != null){
                           resp +=  "\n"+p.info;
                           p = p.sig;
                  }
                  return resp;
         }
         
         public void insertaFinal(T obj){
                  Nodo<T> p;
                  p = prim;
                  if(prim == null)
                           prim = new Nodo<T>(obj,null);
                  else{
                            while(p.sig != null)
                                     p = p.sig;
                            p.sig = new Nodo<T>(obj,null);
                  }
         }
}
