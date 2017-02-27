package multiplicacionrusa;

/**
 *
 * @author Claudia
 */
public class Rusa extends Lista<Integer> {
         private Lista<Integer> res;
         public Rusa() {
                  super();
                  res = new Lista<Integer>();
         }
         
         public Integer suma(Lista<Integer> div2, Lista<Integer> mul2){
                  Nodo<Integer> primdiv = div2.prim;
                  Nodo<Integer> primmul = mul2.prim;
                  Nodo<Integer> primres;
                  Integer resTotal = 0; 
                  
                  while(primdiv != null){
                           if(primdiv.info % 2 == 1)
                                    res.insertaFinal(primmul.info);
                           primdiv = primdiv.sig;
                           primmul = primmul.sig;
                  }
                  primres = res.prim;
                  while(primres != null){
                           resTotal += primres.info;
                           primres = primres.sig;
                  }
                  return resTotal;
         }  
}
